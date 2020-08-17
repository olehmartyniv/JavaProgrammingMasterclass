package com.company;

public class TeenNumberChecker {

    public static boolean hasTeen(int firstValue, int secondValue, int thirdValue) {
        return (firstValue > 12 && firstValue < 20) || (secondValue > 12 && secondValue < 20) || (thirdValue > 12
                && thirdValue < 20);
    }

    public static boolean isTeen(int firstValue) {
        return firstValue > 12 && firstValue < 20;
    }
}
