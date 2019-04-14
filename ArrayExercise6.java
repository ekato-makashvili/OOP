package com.company;

public class ArrayExercise6 {

    /**
     * Takes an integer n and an array of integers, and checks whether array elements are factors of n
     * @param n an integer, which should be checked
     * @param integers an integer array
     * @return true if the numbers in the array are all factors of n
     */
    public static boolean areFactors(int n, int[] integers) {
        boolean flag = true;
        for (int integer : integers) {
            if (n % integer != 0) {
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 5, 10};
        boolean b = areFactors(21, numbers);
        System.out.println(b);

    }
}
