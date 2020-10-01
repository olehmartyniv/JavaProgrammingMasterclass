package com.company;

import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer> customers = new ArrayList<>();;

    public Branch(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchName() {
        return branchName;
    }

    public Customer getCustomer(String customerName) {
        return customers.get(getIndexIfExist(customerName));
    }

    public void showBranchCustomers() {
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

    public void addTransaction(String customerName, double transaction) {
        int index = getIndexIfExist(customerName);
        if (index < 0) {
            System.out.println("There is no such customer in this branch");
        } else {
            customers.get(index).createNewTransaction(transaction);
        }
    }

    private int getIndexIfExist(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getCustomerName().equals(customerName)) return i;
        }

        return -1;
    }
}
