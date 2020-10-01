package com.company;

import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Branch> branches = new ArrayList<>();

    public Branch getBranch(String branchName) {
        return branches.get(getIndexIfExist(branchName));
    }

    public void createNewBranch(String branchName) {
        if (getIndexIfExist(branchName) >= 0) {
            System.out.println("Such branch is already exist");
        } else if (branchName.isEmpty()) {
            System.out.println("Name can't be blank");
        } else {
            branches.add(new Branch(branchName));
        }
    }

    public void printBranchesList() {
        if (branches.isEmpty()) {
            System.out.println("There are no any branches");
            return;
        }

        System.out.printf("%-3s %-10s\n", "#", "Name");
        for (int i = 0; i < branches.size(); i++) {
            System.out.printf("%-3s %-10s%n", (i + 1), branches.get(i).getBranchName());
        }
    }

    private int getIndexIfExist(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getBranchName().equals(branchName)) return i;
        }

        return -1;
    }
}
