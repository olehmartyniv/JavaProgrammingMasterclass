package com.company;

public class Main {

    public static void main(String[] args) {
	    Branch first = new Branch("qwe");
	    first.createNewCustomer("Tim", 200);
        first.addTransaction("Tim", 100);
	    first.showBranchCustomers();
    }
}
