package com.company;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static Bank bank = new Bank();

    public static void main(String[] args) {
		boolean showMenu = true;
		while (showMenu) {
			System.out.print("\nPress\n" +
					"\t1 - To print the list of branches\n" +
					"\t2 - To select branch\n" +
					"\t3 - To add a new branch\n" +
					"\t0 - To quit the application\n" +
					"Enter you choice: ");
			switch (scanner.nextLine()) {
				case "0":
					showMenu = false;
					break;
				case "1":
					bank.printBranchesList();
					break;
				case "2":
					System.out.print("Select a branch");
					bank.printBranchesList();
					branchMenu(scanner.nextLine());
					break;
				case "3":
					System.out.print("Enter branch name: ");
					bank.createNewBranch(scanner.nextLine());
					break;
			}
		}
    }

	public static void branchMenu(String branchName) {
		Branch selectedBranch = bank.getBranch(branchName);
		boolean showMenu = true;
		while (showMenu) {
			System.out.print("\nPress\n" +
					"\t1 - To print the list of customers\n" +
					"\t2 - To add a new customer\n" +
					"\t3 - To add a new transaction\n" +
					"\t0 - To go back\n" +
					"Enter you choice: ");
			switch (scanner.nextLine()) {
				case "0":
					showMenu = false;
					break;
				case "1":
					selectedBranch.showBranchCustomers();
					break;
				case "2":
					selectedBranch.createNewCustomer();
					break;
				case "3":

					break;
			}
		}
	}
}
