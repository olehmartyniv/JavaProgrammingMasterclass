package com.company;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> contacts = new ArrayList<>();

    public void printContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Contact list is empty");
            return;
        }

        System.out.printf("%-3s %-15s %-10s%n", "#", "Name", "Number");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.printf("%-3s %-15s %-10s%n", (i + 1), contacts.get(i).getContactName(), contacts.get(i).getPhoneNumber());
        }
    }

    public void addContact(String name, String number) {
        if (searchName(name) >= 0) {
            System.out.println("Contact with such name already exists");
        } else {
            contacts.add(new Contact(name, number));
            System.out.println("Contact was added");
        }
    }

    public void updateNumber(String name, String newNumber) {
        int index = searchName(name);
        if (index < 0) {
            System.out.println("There is no such contact");
        } else {
            contacts.get(index).setPhoneNumber(newNumber);
            System.out.println("Contact was updated");
        }
    }
    public void updateName(String currentName, String newName) {
        int index = searchName(currentName);
        if (index < 0) {
            System.out.println("There is no such contact");
        } else if (searchName(newName) >= 0) {
            System.out.println("Contact with such name already exists");
        } else {
            contacts.get(index).setContactName(newName);
            System.out.println("Contact was updated");
        }
    }


    public void removeContact(String name) {
        int index = searchName(name);
        if (index < 0) System.out.println("There is no such contact");
        else {
            contacts.remove(index);
            System.out.println("Contact was deleted");
        }
    }

    private int searchName(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getContactName().equals(name)) return i;
        }

        return -1;
    }

    public void findContact(String value) {
        int count = 0;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getContactName().equals(value) || contacts.get(i).getPhoneNumber().equals(value)) {
                count++;
                if (count == 1) System.out.printf("%-3s %-15s %-10s%n", "#", "Name", "Number");
                System.out.printf("%-3d %-15s %-10s%n", count, contacts.get(i).getContactName(), contacts.get(i).getPhoneNumber());
            }
        }

        if (count == 0) System.out.println("No results");
    }
}
