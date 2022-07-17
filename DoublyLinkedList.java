/* In the name of Allah
 *  Master Name: Ali Rezaei
 *  Student Name: Mostafa Khawari
 */

package DoublyLinkedList;

public class DoublyLinkedList{
    private Node head;
    private Node tail;
    private Node nill;
    private int size;

    //create a sentinel node
    public DoublyLinkedList(){
        this.nill = new Node(null);
        this.nill.previous = nill;
        this.nill.next = nill;

        this.head = nill;
        this.tail = nill;

        this.size = 0;
    }//end Constructor

    //show DoublyLinkedList nodes
    public void show(){
        Node x = head;
        System.out.print("Doubly linked list: Front >>> ( ");
        for(int i=0; i<=size; i++){
            if(i == size - 1)
                System.out.print(x.data);
            else if(i != size)
                System.out.print(x.data + " , ");
            x = x.next;
        }
        System.out.println(") <<< Back");
    }//end show

    //return size of DoublyLinkedList
    public int size(){
        return size;
    }//end size 

    //return boolean answer >> DoublyLinkedList is empty or no ???
    public boolean isEmpty(){
        return head == nill;
    }//end isEmpty

    //return node at front of DoublyLinkedList
    public String getFront(){
        if(isEmpty())
            return "# Doubly Linked List is Empty :(";
        else
            return "# First Node: "+ head.data;
    }//end getFront

    //return node at back of DoublyLinkedList
    public String getBack(){
        if(isEmpty())
            return "# Doubly Linked List is Empty :(";
        else
            return "# Last Node: "+ tail.data;
    }//end getBack

    //return count of a node 
    public int count(String data){
        int count = 0;
        Node x = head;
        while(x != nill){
            if(data.equals(x.data))
                count++;
            x = x.next;
        }
        return count;
    }//end count

    //swap a new DoublyLinkedList with this DoublyLinkedList
    public void swap(DoublyLinkedList otherList){
        Node tempNode = head;
        head = otherList.head;
        otherList.head = tempNode;

        tempNode = tail;
        tail = otherList.tail;
        otherList.tail = tempNode;

        int tempNumber = size;
        size = otherList.size;
        otherList.size = tempNumber;
    }//end swap

    //insert a new node at front of DoublyLinkedList
    public void pushFront(String data){
        Node node = new Node ( data );
		node.next = head;
		node.previous = nill;
		
		if ( head != nill )
			head.previous = node;
		else
			tail = node;
		
		head = node;
		
        size++;
    }//end pushFront

    //insert a new node at back of DoublyLinkedList
    public void pushBack(String data){
        Node node = new Node ( data );
		node.previous = tail;
		node.next = nill;
		
		if ( tail != nill )
			tail.next = node;
		else
			head = node;
		
		tail = node;
		
		size++;
    }//end pushBack

    //remove node at front of DoublyLinkedList
    public void popFront(){
        if(isEmpty())
            System.out.println(">>> Linked List UnderFlow :(");
        else{
            if(size == 1){
                System.out.println(getFront()+ " Removed :)");
                head = nill;
                tail = nill;
            }
            else{
                System.out.println(getFront()+ " Removed :)");
                head.next.previous = nill;
                head = head.next;
            }

            size--;
        }   
    }//end popFrony


    //remove node at back of DoublyLinkedList
    public void popBack(){
        if(isEmpty())
            System.out.println(">>> Linked List UnderFlow :( ");
        else{
            if(size == 1){
                System.out.println(getBack()+ " Removed :)");
                head = nill;
                tail = nill;
            }
            else{
                System.out.println(getBack()+ " Removed :)");
                tail.previous.next = nill;
                tail = tail.previous;
            }

            size--;
        }
    }//end popBack

    /*remove all the node in DoublyLinkedList
    * that  have a value equal to the argument value 
    * and return count of it */
    public int erase(String data){
        int count = 0;
        Node x = head;
        while(x != nill){
            if(x.data.equals(data)){
                x.previous.next = x.next;
                x.next.previous = x.previous;
                count++;
                size--;
            }
            x = x.next;
        }
        return count;
    }//end erase

}//end class DoublyLinkedList

//calss Node
class Node{
    String data;
    Node previous;
    Node next;

    public Node(String data){
        this.data = data;
    }// end Constructor Node

}//end class Node