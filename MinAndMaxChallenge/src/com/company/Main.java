package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, number;

        while (true) {
            System.out.println("Enter number:");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number < min) min = number;
                if (number > max) max = number;
            } else {
                System.out.println("Minimum = " + min + " and Maximum = " + max);
                break;
            }
        }

        scanner.close();
    }
}
