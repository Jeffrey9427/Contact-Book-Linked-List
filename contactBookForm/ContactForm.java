package week4.contactBookForm;

import java.util.Scanner;

public class ContactForm {
    Scanner in = new Scanner(System.in);
    private static class Contact {
        private String name;
        private String phoneNumber;
        private String email;
        private Contact next;
        private Contact(String name, String number, String email) {
            this.name = name;
            this.phoneNumber = number;
            this.email = email;
            this.next = null;
        }
    }
    public Contact head = null;
    public void addContact() {
        System.out.print("\nName: ");
        String name = in.next();
        System.out.print("Phone Number: ");
        String number = in.next();
        System.out.print("Email: ");
        String email = in.next();
        Contact newContact = new Contact(name, number, email);

        if (head == null) {
            head = newContact;    // declare the new contact as the head
        } else {
            Contact currentContact = head;
            while (currentContact.next != null) {
                currentContact = currentContact.next;
            }
            currentContact.next = newContact;   // add the new contact at the end of the list
        }
        System.out.println("Your friend's contact has been successfully added!");
    }
    public void contactSearch() {
        System.out.print("Enter the name of the contact to search: ");
        String name = in.next();
        Contact current = head;
        boolean found = false;
        while (current != null) {
            if (current.name.equals(name)) {
                System.out.println("\nName: " + current.name);
                System.out.println("Phone Number: " + current.phoneNumber);
                System.out.println("Email: " + current.email);
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("There is no contact in your contact book that matches the given name.");
        }
    }
    public void deleteContact() {
        Contact current = head;
        if (head == null) {
            System.out.println("There is no contact in your contact book");
            return;
        }
        System.out.print("Enter the name of the contact that you want to delete: ");
        String name = in.next();
        if (head.name.equals(name)) {
            head = head.next;
            System.out.println("Contact is successfully deleted");
            return;
        }

        while (current != null) {
            if (current.next != null && current.next.name.equals(name)) {
                current.next = current.next.next;
                System.out.println("Contact is successfully deleted");
                return;
            }
            current = current.next;
        }

        System.out.println("There is no contact in your contact book that matches the given name");

    }
    public void emailSearch() {
        System.out.print("Enter the email address of the contact to search: ");
        String email = in.next();
        Contact current = head;
        boolean found = false;
        while (current != null) {
            if (current.email.equals(email)) {
                System.out.println("\nName: " + current.name);
                System.out.println("Phone Number: " + current.phoneNumber);
                System.out.println("Email: " + current.email);
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("There is no contact in your contact book that matches the given email.");
        }
    }
    public void printList() {
        Contact current = head;
        while (current != null) {
            System.out.println("\nName: " + current.name);
            System.out.println("Phone Number: " + current.phoneNumber);
            System.out.println("Email: " + current.email);
            current = current.next;
        }
    }
}
