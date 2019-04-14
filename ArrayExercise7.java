package com.company;

public class ArrayExercise7 {

    /**
     * Takes an integer n and an array of integers, and that checks
     * if the numbers in the array are all prime and their product is n
     * @param n integer number
     * @param integers integer array
     * @return true if both condition occurs, otherwise false
     */
    public static boolean arePrimeFactors(int n, int[] integers) {
        boolean flag = true;
        int product = 1;
        for (int integer : integers) {
            product *= integer;
        }
        flag = isPrime(integers);
        if (n != product) {
            flag = false;
        }
        return flag;
    }

    public static boolean isPrime(int[] numbers) {
        boolean b = true;
        for (int number : numbers) {
            if (number == 0 || number == 1) {
                b = false;
            } else {
                for (int j = 2; j < number; j++) {
                    if (number % j == 0) {
                        b = false;
                    }
                }
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 11, 2};
        boolean a = isPrime(arr);
        System.out.println(a);
        boolean b = arePrimeFactors(220, arr);
        System.out.println(b);



    }
}
