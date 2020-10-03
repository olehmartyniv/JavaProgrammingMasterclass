package com.company;

import java.util.ArrayList;

public class Customer {

    private String customerName;
    private ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String customerName, double initialTransaction) {
        this.customerName = customerName;
        transactions.add(initialTransaction);
        System.out.println(customerName + " is created");
    }

    public String getCustomerName() {
        return customerName;
    }

    public void printCustomerTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("There are no any transactions");
            return;
        }

        System.out.println(customerName + "'s transactions:");
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println("Transaction #" + (i + 1) + ": " + transactions.get(i));
        }
    }

    public void createNewTransaction(double transaction) {
        transactions.add(transaction);
        System.out.println("Success");
    }
}
