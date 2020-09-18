package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Non reversed array: " + Arrays.toString(intArray));
        reverse(intArray);
        System.out.println("Reversed array: " + Arrays.toString(intArray));
    }

    static void reverse(int[] array) {
        for (int i = 0; i < (array.length / 2); i++) {
            int temp = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = temp;
        }
    }
}
