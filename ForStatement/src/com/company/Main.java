package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
        }

        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
        }

        for (int countOfPrimeNumbers = 0, i = 10; i < 50; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                countOfPrimeNumbers++;
                if (countOfPrimeNumbers == 10) break;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * interestRate / 100;
    }
}
