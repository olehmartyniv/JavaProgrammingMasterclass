package com.company;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int reverse = 0, positiveNumber = Math.abs(number);

        while (positiveNumber > 0) {
            reverse += positiveNumber % 10;
            positiveNumber /= 10;
            if (positiveNumber > 0) reverse *= 10;
        }

        return Math.abs(number) == reverse;
    }
}
