//Vinicius Araujo, Assignment 3, Second Semester
//The purpose of this file is to
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);      //Creates a scanner object that takes input from user

        System.out.println("Enter number of people: ");
        int N = scan.nextInt();     //Gets first input from user(amount of people)

        System.out.println("Enter number of skips: ");
        int M = scan.nextInt();     //Gets second input from user(number of skips)

        CircularLinkedList list = new CircularLinkedList();

        for (int i = 1; i <= N ; i++) {
            list.add(i);     //Adds the number of people chosen by the user to the circular linked list by calling method from circular linked list
        }

        System.out.println("The winner is person number: " + list.runGame(N, M)); //calls the method to run the game on the Circular Linked List created with the amount of players.
    }
}