package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count: ");
	    int[] myIntArray = readIntegers(scanner.nextInt());
	    System.out.println("Minimum is " + findMin(myIntArray));
    }

    static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.printf("Enter %d numbers:\n", count);
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();
        return array;
    }

    static int findMin(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) minValue = array[i];
        }

        return minValue;
    }
}
