//Vinicius Araujo, Assignment 3, Second Semester
//The purpose of this file is to create a circular linked list and methods to run the game
class CircularLinkedList {
    private Node head;
    private Node tail;

    public CircularLinkedList() {   //Constructor for the Circular Linked List
        head = null;
        tail = null;
    }



    public void add(int data) {      //method to add a node to the end of the list
        Node newNode = new Node(data);  //Creates new node

        if(head == null) {
            head = newNode;
            tail = newNode;     //If list is empty, head and tail point to the new node.
            newNode.next = head;
        }
        else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;       //Tails points to head to make it a circular list
        }
    }


    public void delete(Node prev, Node curr) {  // Method to delete a node from the circular linked list
        prev.next = curr.next;
    }


    public int runGame(int N, int M) { //Method to run the game
        Node curr = head;
        Node prev = null;

        if (M == 0) {
            curr.data = N;
        } else {


        for (int i = 0; i < M - 1; i++) {   //Goes to the "M" Node
            prev = curr;
            curr = curr.next;
        }

        while (curr.next != curr) {
            delete(prev, curr); // Deletes current node
            curr = prev.next;   // Moves it to next node

            for (int i = 0; i < M - 1 ; i++) {
                prev = curr;
                curr = curr.next;
            }
            }
        }

        return curr.data; // Returns the number of the winner
    }
}



