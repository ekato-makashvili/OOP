package com.company;

import java.util.Arrays;

public class ArrayExercise5 {
    /**
     * Takes an integer parameter n and indicates, for each number from 0 to n - 1, whether the number is prime
     * @param n limit
     * @return boolean array
     */
public static boolean[] sieve(int n) {
    boolean[] numbers = new boolean[n];
    for (int i = 2; i < numbers.length; i++) {
        numbers[i] = true;
    }
    for (int p = 2; p*p <= n; p++)
        if (numbers[p])
        for (int j = p*2; j < n; j+=p) {
                numbers[j] = false;
        }
    return numbers;
}

    public static void main(String[] args) {

       String b =  Arrays.toString(sieve(25));
        System.out.println(b);
    }
}
