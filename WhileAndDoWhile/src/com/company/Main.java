package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 0;

        while (count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        count = 0;
        do {
            System.out.println("Count value was " + count);
            count++;

            if (count > 100) break;
        } while (count != 5);

        int number = 4;
        int finishNumber = 20;
        int countOfEvenNumbers = 0;

        while (number <= finishNumber) {
            number++;

            if (!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);
            countOfEvenNumbers++;

            if (countOfEvenNumbers >= 5) break;
        }

        System.out.println("Total even numbers found is " + countOfEvenNumbers);

        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static int sumDigits(int number) {
        if (number < 10) return -1;

        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
