package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", 0.0, "Bob Brown",
                "mail@domain.com", "(097) 46-20-112");
        System.out.println(account.getBalance());

        BankAccount timAccount = new BankAccount("Tim", "email", "phone");
        System.out.println(timAccount.getCustomerName() + " " + timAccount.getBalance());

        VipCustomer vip = new VipCustomer();
        System.out.println(vip.getCustomerName());
    }
}
