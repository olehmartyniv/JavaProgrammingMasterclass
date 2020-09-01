package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1, sum = 0;

        while (counter <= 10) {
            System.out.println("Enter number #" + counter + ":");
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                counter++;
            } else {
                System.out.println("Invalid number");
                scanner.nextLine();
            }
        }

        System.out.println("Sum of numbers is " + sum);
        scanner.close();
    }
}
