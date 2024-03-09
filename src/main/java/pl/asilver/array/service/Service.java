package pl.asilver.array.service;

import java.lang.reflect.Array;

public class Service {

    public static void findEvenNumbers(int[] arr) {
        int i = 0;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] % 2 == 0) {
                i++;
            }
        }
        System.out.println("The number of even numbers is: " + i + ".");
    }

    public static void findOddNumbers(int[] arr) {
        int i = 0;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] % 2 != 0) {
                i++;
            }
        }
        System.out.println("The number of odd numbers is: " + i + ".");
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int y = 2; y <= Math.sqrt(num); y++) {
            if (num % y == 0) {
                return false;
            }
        }
        return true;
    }

    public static void findPrimeNumbers(int[] arr) {
        int i = 0;
        for (int num : arr) {
            if (isPrime(num)) {
                i++;
            }
        }
        System.out.println("The number of prime numbers is: " + i + ".");
    }

    public static void findNumbersSum(int[] arr) {
        int i = 0;
        for (int x = 0; x < arr.length; x++) {
            i = i + arr[x];
        }
        System.out.println("The sum of the numbers in array is: " + i + ".");
    }

    public static void findDifOfEvenOddIndexes(int[] arr) {
        int i = 0;
        int e = 0;
        int o = 0;
        for (int x = 0; x < arr.length; x++) {
            if (x % 2 == 0) {
                e = e + arr[x];
            }
        }
        for (int x = 0; x < arr.length; x++) {
            if (x % 2 != 0) {
                o = o + arr[x];
            }
        }
        i = e - o;
        System.out.println("The difference sum of numbers with even and odd indexes is: " +
                i + ".");
    }

    public static void findNullNumber(int[] arr) {
        int i = 0;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == 0) {
                i++;
            }
        }
        System.out.println("The number of nulls is: " + i + ".");
    }
}
