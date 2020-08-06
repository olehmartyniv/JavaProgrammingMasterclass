package com.company;

public class Main {

    public static void main(String[] args) {

        byte byteValue = 55;
        short shortValue = 16345;
        int intValue = 123456;

        long longTotal = 50000 + 10 * (byteValue + shortValue + intValue);
        System.out.println(longTotal);
    }
}
