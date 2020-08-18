package com.company;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(minutes + " min = " + (minutes / 1440) / 365 + " y and "
                    + (minutes / 1440) % 365 + " d");
        }
    }
}
