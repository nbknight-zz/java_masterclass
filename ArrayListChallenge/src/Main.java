import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Contacts contacts = new Contacts();
    public static void main(String[] args) {
        boolean exit = false;
        int choice = 0;
        printInstructions();
        while (!exit) {
            System.out.println("Enter a choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    contacts.viewContactName();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    exit = true;
                    break;

            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print your contact list.");
        System.out.println("\t 2 - To add a contact");
        System.out.println("\t 3 - To exit");
    }

    public static void addContact() {
        System.out.println("Please add a contact: ");
        contacts.addContact(scanner.nextLine());
        System.out.println("Please add phone number: ");
        contacts.addPhone(scanner.nextLine());
    }

    public static void modifyContact() {

    }
}
