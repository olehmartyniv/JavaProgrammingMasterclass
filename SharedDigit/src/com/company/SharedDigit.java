package com.company;

public class SharedDigit {

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) return false;

        while (firstNumber > 0) {
            int digitToCompare = firstNumber % 10, tempNumber = secondNumber;
            while (tempNumber > 0) {
                if (tempNumber % 10 == digitToCompare) return true;
                tempNumber /= 10;
            }

            firstNumber /= 10;
        }

        return false;
    }
}
