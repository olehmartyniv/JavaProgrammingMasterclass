package com.company;

public class IntEqualityPrinter {

    public static void printEqual(int firstValue, int secondValue, int thirdValue) {
        if (firstValue < 0 || secondValue < 0 || thirdValue < 0) {
            System.out.println("Invalid Value");
        } else if (firstValue == secondValue && firstValue == thirdValue) {
            System.out.println("All numbers are equal");
        } else if (firstValue == secondValue ^ firstValue == thirdValue ^ secondValue == thirdValue) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }
}
