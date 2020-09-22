package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        boolean showMenu = true;
	    while (showMenu) {
            printOptions();
            switch (scanner.nextLine()) {
                case "0":
                    showMenu = false;
                    break;
                case "1":
                    printContacts();
                    break;
                case "2":
                    addContact();
                    break;
                case "3":
                    updateContact();
                    break;
                case "4":
                    removeContact();
                    break;
                case "5":
                    searchContact();
                    break;
            }
        }
    }

    public static void printOptions() {
        System.out.print("\nPress\n\t0 - To quit the application\n\t1 - To print the list of contacts\n" +
                "\t2 - To add a new contact\n\t3 - To update existing contact\n\t4 - To remove contact\n" +
                "\t5 - To search for a contact\nEnter you choice: ");
    }

    public static void printContacts() {
        mobilePhone.printContacts();
    }

    public static void addContact() {
        String name = validateInput("Name");
        String number = validateInput("Number");
        mobilePhone.addContact(name, number);
    }

    public static void updateContact() {
        String currentName = validateInput("Name");
        System.out.print("\t1 - To update the name\n" +
                        "\t2 - To update the number\n");
        switch (scanner.nextLine()) {
            case "1":
                String newName = validateInput("New Name");
                mobilePhone.updateName(currentName, newName);
                break;
            case "2":
                String newNumber = validateInput("New Number");
                mobilePhone.updateNumber(currentName, newNumber);
                break;
        }
    }

    public static void removeContact() {
        String value = validateInput("Name");
        mobilePhone.removeContact(value);
    }

    public static void searchContact() {
        String searchValue = validateInput("Name or Number");
        mobilePhone.findContact(searchValue);
    }

    public static String validateInput(String type) {
        String input;
        do {
            System.out.print("Please enter a " + type + ": ");
            input = scanner.nextLine();
            if (input.length() < 1) System.out.println(type + " can't be blank");
        } while (input.length() < 1);

        return input;
    }
}
