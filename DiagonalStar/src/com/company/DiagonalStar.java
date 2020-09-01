package com.company;

public class DiagonalStar {

    public static void printSquareStar(int number) {
        if (number < 5 ) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    if (j == 0 || i == 0 || j == i || (j == number - 1)
                            || (i == number - 1) || (j == number - i - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                if (i != number - 1) System.out.println();
            }
        }
    }
}
