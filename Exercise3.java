package com.company;

public class Exercise3 {

    /**
     * Takes integer and creates an array with given integer length
     * @param n integer number for the array length
     * @return the array whose elemennts are integers from 1 to n (excluded)
     */
    public static int[] make(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        return a;
    }

    /**
     * Takes an array and multiplies each element to two
     * @param jub int type array
     */
    public static void dub(int[] jub) {
        for (int i = 0; i < jub.length; i++) {
            jub[i] *= 2;
        }
    }

    /**
     * Takes an array and counts sum of each element
     * @param zoo int type array
     * @return sum of the elements
     */
    public static int mus(int[] zoo) {
        int fus = 0;
        for (int i = 0; i < zoo.length; i++) {
            fus += zoo[i];
        }
        return fus;
    }
    public static void main(String[] args) {
        int[] bob = make(3);
        dub(bob);
        System.out.println(mus(bob));
    }
}
