package pl.asilver.array.service;

import java.util.Arrays;

public class Service {

    public static void countEvenNumbers(int[] arr) {
        int i = 0;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] % 2 == 0) {
                i++;
            }
        }
        System.out.println("The number of even numbers is: " + i + ".");
    }

    public static void countOddNumbers(int[] arr) {
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

    public static void countPrimeNumbers(int[] arr) {
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
        System.out.println("The difference of sum of numbers with even and odd indexes is: " +
                i + ".");
    }

    public static void countZeroNumbers(int[] arr) {
        int i = 0;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == 0) {
                i++;
            }
        }
        System.out.println("The number of zeros is: " + i + ".");
    }

    public static void sortArray(int[] array) {
        for (int x = 0; x < array.length - 1; x++) {
            for (int i = 0; i < array.length - x - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.print("Sorted array: ");
        for (int y = 0; y < array.length; y++) {
            System.out.print(" " + array[y]);
        }
    }
}
