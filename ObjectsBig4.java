package com.company;

import java.math.BigInteger;

public class ObjectsBig4 {

    public static BigInteger factorial(int n) {
        if (n == 0) {
            return BigInteger.valueOf(1);
        } else {
            return BigInteger.valueOf(n).multiply(factorial(n-1));
        }
    }

    public static void main(String[] args) {
        BigInteger small = BigInteger.valueOf(5);
        BigInteger big = BigInteger.valueOf(17000000);
        BigInteger total = small.add(big);
        System.out.println(total);
        System.out.println(big);

        int[] numbers = new int[30];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
            int number = numbers[i];
            BigInteger factorial = factorial(number);
            System.out.printf("!%s = %d\n", number, factorial);
        }
    }
}
