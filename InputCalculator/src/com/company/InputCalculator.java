package com.company;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, counter = 0;

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            sum += number;
            counter++;
        }

        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum / counter));
        scanner.close();
    }
}
