package com.company;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int firstNum, int secondNum) {
        if (firstNum < 10 || secondNum < 10) return -1;

        int lessNum = Math.min(firstNum, secondNum);
        for (int i = lessNum; i > 0; i--) {
            if (firstNum % i == 0 && secondNum % i == 0) return i;
        }

        return 1;
    }
}
