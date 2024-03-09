package pl.asilver.array.main;


import pl.asilver.array.service.Service;

public class _Main {
    public static void main(String[] args) {
        int[] array = new int[]{3, 20, -5, 6, 11, 4, 9, 0, 15, -10};
        Service service = new Service();
        service.countEvenNumbers(array);
        service.countOddNumbers(array);
        service.countPrimeNumbers(array);
        service.findNumbersSum(array);
        service.findDifOfEvenOddIndexes(array);
        service.countZeroNumbers(array);
    }
}
