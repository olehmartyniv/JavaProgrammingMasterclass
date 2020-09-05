package com.company;

public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public BankAccount() {
        this("67890", 10.0, "Default name", "Default email",
                "Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String number, double balance, String customerName, String customerEmail,
                       String customerPhoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
        System.out.println("Constructor with parameters called");
    }

    public BankAccount(String customerName, String customerEmail, String customerPhoneNumber) {
        this("99999", 20.0, customerName, customerEmail, customerPhoneNumber);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void depositFunds(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of " + amount + " made. New balance is " + balance);
        } else {
            System.out.println("Amount is incorrect");
        }
    }

    public void deductFunds(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " processed, Remaining balance = " + balance);
        } else {
            System.out.println("Only " + balance + " available. Withdrawal not processed");
        }
    }
}
