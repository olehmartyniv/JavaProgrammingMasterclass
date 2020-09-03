package com.company;

public class VipCustomer {

    private String customerName;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Default Name", 0.0, "Email Address");
    }

    public VipCustomer(String customerName, String emailAddress) {
        this(customerName, 100.0, emailAddress);
    }

    public VipCustomer(String customerName, double creditLimit, String emailAddress) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
