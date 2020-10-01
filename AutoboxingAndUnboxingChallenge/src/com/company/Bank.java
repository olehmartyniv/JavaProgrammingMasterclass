package com.company;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Branch> branches = new ArrayList<>();

    public void createNewBranch(String branchName) {
        if (getIndexIfExist(branchName) >= 0) {
            System.out.println("Such branch is already exist");
        } else {
            branches.add(new Branch(branchName));
        }
    }

    private int getIndexIfExist(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getBranchName().equals(branchName)) return i;
        }

        return -1;
    }
}
