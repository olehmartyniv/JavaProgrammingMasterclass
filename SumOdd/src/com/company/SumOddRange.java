package com.company;

public class SumOddRange {

    public static boolean isOdd(int number) {
        if (number < 0) return false;
        else return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if (start < 0 || end < 0 || start > end) return -1;

        int sum = 0;

        for (; start <= end; start++) {
            if (isOdd(start)) sum += start;
        }

        return sum;
    }
}
