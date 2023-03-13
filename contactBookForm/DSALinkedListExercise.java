package week4.contactBookForm;

import java.util.Scanner;

public class DSALinkedListExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ContactForm contactBookForm = new ContactForm();
        while (true) {
            System.out.println();
            System.out.println("***************************************");
            System.out.println("(A)dd");
            System.out.println("(D)elete");
            System.out.println("(E)mail Search");
            System.out.println("(P)rint List");
            System.out.println("(S)earch");
            System.out.println("(Q)uit");
            System.out.println("***************************************");
            System.out.print("Please enter a command: ");
            char command = in.next().charAt(0);

            switch (command) {
                case 'A':
                    contactBookForm.addContact();
                    break;
                case 'D':
                    contactBookForm.deleteContact();
                    break;
                case 'E':
                    contactBookForm.emailSearch();
                    break;
                case 'P':
                    contactBookForm.printList();
                    break;
                case 'S':
                    contactBookForm.contactSearch();
                    break;
                case 'Q':
                    return;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }
    }
}
