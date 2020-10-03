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
					"\t3 - To create a new branch\n" +
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
					bank.printBranchesList();
					if (bank.getBranches().size() > 0) {
						System.out.print("Select a branch: ");
						branchMenu(bank.getBranch(scanner.nextLine()));
					}
					break;
				case "3":
					System.out.print("Enter branch name: ");
					String name = scanner.nextLine();
					bank.createNewBranch(name);
					branchMenu(bank.getBranch(name));
					break;
			}
		}
    }

	public static void branchMenu(Branch branch) {
		if (branch == null) {
			System.out.println("Branch doesn't exist");
			return;
		}

		boolean showMenu = true;
		while (showMenu) {
			System.out.print("\nPress\n" +
					"\t1 - To print the list of customers\n" +
					"\t2 - To select customer\n" +
					"\t3 - To create a new customer\n" +
					"\t0 - To go back\n" +
					"Enter you choice: ");
			switch (scanner.nextLine()) {
				case "0":
					showMenu = false;
					break;
				case "1":
					branch.printBranchCustomers();
					break;
				case "2":
					branch.printBranchCustomers();
					if (branch.getCustomers().size() > 0) {
						System.out.print("Select a customer: ");
						customerMenu(branch.getCustomer(scanner.nextLine()));
					}
					break;
				case "3":
					String name = validateName();
					branch.createNewCustomer(name, validateAmount());
					customerMenu(branch.getCustomer(name));
					break;
			}
		}
	}

	public static void customerMenu(Customer customer) {
		if (customer == null) {
			System.out.println("Customer doesn't exist");
			return;
		}

		boolean showMenu = true;
		while (showMenu) {
			System.out.print("\nPress\n" +
					"\t1 - To print the list of transactions\n" +
					"\t2 - To create a new transaction\n" +
					"\t0 - To go back\n" +
					"Enter you choice: ");
			switch (scanner.nextLine()) {
				case "0":
					showMenu = false;
					break;
				case "1":
					customer.printCustomerTransactions();
					break;
				case "2":
					customer.createNewTransaction(validateAmount());
					break;
			}
		}
	}

	public static String validateName() {
		String input;
		do {
			System.out.print("Please enter customer name: ");
			input = scanner.nextLine();
			if (input.length() < 1) System.out.println("Name can't be blank");
		} while (input.length() < 1);

		return input;
	}

	public static double validateAmount() {
		double input;
		do {
			System.out.print("Please enter transaction amount: ");
			input = scanner.nextDouble();
			scanner.nextLine();
			if (input == 0) System.out.println("Amount can't be zero");
		} while (input == 0);

		return input;
	}
}
