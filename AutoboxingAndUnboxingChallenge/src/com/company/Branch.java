package com.company;

import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer> customers = new ArrayList<>();;

    public Branch(String branchName) {
        this.branchName = branchName;
        System.out.println(branchName + " branch is created");
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public Customer getCustomer(String customerName) {
        int index = getIndexIfExist(customerName);
        return (index < 0) ? null : customers.get(index);
    }

    public void printBranchCustomers() {
        if (customers.isEmpty()) {
            System.out.println("There are no any customers");
            return;
        }

        System.out.println("Customers in " + branchName + " branch:");
        for (int i = 0; i < customers.size(); i++) {
            System.out.println("Customer #" + (i + 1) + ": " + customers.get(i).getCustomerName());
        }
    }

    public void createNewCustomer(String customerName, double initialTransaction) {
        if (getIndexIfExist(customerName) >= 0) {
            System.out.println("Customer already exist in this branch");
        } else {
            customers.add(new Customer(customerName, initialTransaction));
        }
    }

    private int getIndexIfExist(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getCustomerName().equals(customerName)) return i;
        }

        return -1;
    }
}
