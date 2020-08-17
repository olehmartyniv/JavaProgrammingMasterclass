package com.company;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstParameter, double secondParameter) {
        int firstValue = (int) (firstParameter * 1000);
        int secondValue = (int) (secondParameter * 1000);

        return firstValue == secondValue;
    }
}
