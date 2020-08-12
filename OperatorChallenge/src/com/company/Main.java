package com.company;

public class Main {

    public static void main(String[] args) {

        double firstValue = 20.0;
        double secondValue = 80.0;

        boolean isNoRemainder = (((firstValue + secondValue) * 100.0 % 40.0d) == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
