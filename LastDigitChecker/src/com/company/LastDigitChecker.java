package com.company;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int firstNum, int secondNum, int thirdNum) {
        if (!isValid(firstNum) || !isValid(secondNum) || !isValid(thirdNum)) return false;

        return firstNum % 10 == secondNum % 10 || firstNum % 10 == thirdNum % 10
                || secondNum % 10 == thirdNum % 10;
    }
    
    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}
