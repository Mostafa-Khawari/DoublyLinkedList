/* In the name of Allah
 *  Master Name: Ali Rezaei
 *  Student Name: Mostafa Khawari
 */
package DoublyLinkedList;

import java.util.Scanner;

public class Tester{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //make a sentinel node
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        System.out.print("                      << In The Name Of Allah >>\n");
            // insert data to Doubly linked list
            String data= "";
            boolean runLoop = true;
            do{
                printMenu();
                // get user's selection
                int select = input.nextInt();
                input.nextLine();
                System.out.println();
                switch(select){
                    //Show Doubly linked list
                    case 1:
                        if(doublyLinkedList.isEmpty())
                            System.out.println("# Doubly linked list is Empty !");
                        else
                            doublyLinkedList.show();
                        break;
                    //Size of Doubly linked list 
                    case 2:
                        System.out.println("Size of Doubly linked list: " + doublyLinkedList.size());
                        break;
                    //Doubly linked list is Empty ???
                    case 3:
                        if(doublyLinkedList.isEmpty())
                        System.out.println("Yes, Doubly linked list is Empty !");
                    else
                        System.out.println("No, Doubly linked list is NOT Empty !");
                        break;
                    //Node at the Front of Doubly linked list(first node)
                    case 4:
                        System.out.println(doublyLinkedList.getFront());
                        break;
                    //Node at the Back of Doubly linked list(last node)
                    case 5:
                        System.out.println(doublyLinkedList.getBack());
                        break;
                    //Count numbers of a Node    
                    case 6:
                        System.out.print("Enter Data: ");
                        data = input.nextLine();
                        System.out.println("Numbers of your Data: " + doublyLinkedList.count(data));
                        break;
                    //Swap a new Doubly linked list
                    case 7:
                        doublyLinkedList.swap(swap());
                        break;
                    //Insert New Node at Front of Doubly linked list
                    case 8:
                        System.out.print("Enter Data: ");
                        data = input.nextLine();
                        doublyLinkedList.pushFront(data);
                        break;
                    //Insert New Node at Back of Doubly linked list
                    case 9:
                            System.out.print("Enter Data: ");
                            data = input.nextLine();
                            doublyLinkedList.pushBack(data);
                        break;
                    //Remove the Node at Front of Doubly linked list   
                    case 10:
                        doublyLinkedList.popFront();
                        break;
                    //Remove the Node at Back of Doubly linked list
                    case 11:
                        doublyLinkedList.popBack();
                        break;
                    //Erase all of a Node from Doybly linked list
                    case 12:
                        if(doublyLinkedList.isEmpty())
                            System.out.println("# Doubly Linked List is Empty :(");
                        else{
                            System.out.print("Enter Data: ");
                            data = input.nextLine();
                            int count = doublyLinkedList.erase(data);
                            System.out.println("Erased "+ count+ " node :)");
                        }
                        break;
                    //Empties Doubly linked list
                    case 13:
                        //doublyLinkedList.clear();
                        doublyLinkedList = new DoublyLinkedList();
                        System.out.println("Doubly linked list Cleard :) ");
                        break;
                    //Exit the programe
                    case 0:
                        System.out.println("                  *************");
                        System.out.println("                  * Good Bye! *");
                        System.out.println("                  *************");
                        runLoop = false;
                        break;
                    default:
                        System.out.println(">>> Enter Correct Number plz :)) ");
                    }
                }while(runLoop); // end do_while Loop
    }// end main method
    
    //make a new Doubly linked list ans swap it
    public static DoublyLinkedList swap(){
        Scanner input = new Scanner(System.in);

        // make an empty or new Doubly linked list
        DoublyLinkedList newDoublyLinkedList = new DoublyLinkedList();

        // insert data to Doubly linked list
        String data= "";
        boolean runLoop = true;
        do{
            printMenuSwap();
            // get user's selection
            int select = input.nextInt();
            input.nextLine();
            System.out.println();
            switch(select){
                //Insert New Node [Front of  New Doubly linked list] 
                case 1:
                    System.out.print("Enter Data: ");
                    data = input.nextLine();
                    newDoublyLinkedList.pushFront(data);
                    break;
                
                //Insert New Node [Back of  New Doubly linked list]    
                case 2:
                    System.out.print("Enter Data: ");
                    data = input.nextLine();
                    newDoublyLinkedList.pushBack(data);
                    break;
                
                //swap :)
                case 0:
                    runLoop = false;
                    break;

                default:
                    System.out.println(">>> Enter Correct Number plz :)) ");
            }
        }while(runLoop); // end do_while Loop

        return newDoublyLinkedList;
    }//end swap methode

    //print Menu
    public static void printMenu() {
        System.out.println();
        System.out.println(" _______________________________________________________");
        System.out.println("| 1)  Show Doubly linked list                           |");
        System.out.println("| 2)  Size of Doubly linked list                        |");
        System.out.println("| 3)  Doubly linked list is Empty ???                   |");
        System.out.println("| 4)  Node at the Front of Doubly linked list           |");
        System.out.println("| 5)  Node at the Back of Doubly linked list            |");   
        System.out.println("| 6)  Count numbers of a Node                           |");
        System.out.println("| 7)  Swap a new Doubly linked list                     |");
        System.out.println("| 8)  Insert New Node [Front of Doubly linked list]     |");
        System.out.println("| 9)  Insert New Node [Back of Doubly linked list]      |");
        System.out.println("| 10) Remove the Node [Front of Doubly linked list]     |");
        System.out.println("| 11) Remove the Node [Back of Doubly linked list]      |");
        System.out.println("| 12) Erase all of a Node from Doybly linked list       |");
        System.out.println("| 13) Empties Doubly linked list                        |");
        System.out.println("| 0)  Exit                                              |");
        System.out.println(" _______________________________________________________");
        System.out.print(">>> Please enter a number between (0) & (13): ");
    } // end printMenu method

    //print Menu for swap
    public static void printMenuSwap() {
        System.out.println();
        System.out.println(" ___________________________________________________________");
        System.out.println("| 1) Insert New Node [Front of  New Doubly linked list]     |");
        System.out.println("| 2) Insert New Node [Back of  New Doubly linked list]      |");
        System.out.println("| 0) Swap                                                   |");
        System.out.println(" ___________________________________________________________");
        System.out.print(">>> Please enter a number between (0) & (2): ");
    } // end printMenuSwap method

}//end class Tester