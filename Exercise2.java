package com.company;

import java.util.Arrays;

public class Exercise2 {

    /**
     * Takes an int array and multiplies elements
     * @param a int type array
     * @return product of each element
     */
    public static int banana(int[] a) {
        int kiwi = 1;
        int i = 0;
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }

    /**
     * Takes an int array and integer number, checks if given integer exists in the array
     * @param a int type array
     * @param grape integer number, which to be find
     * @return first index of the element if found, else -1
     */
    public static int grapefruit(int[] a, int grape) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Takes an int array and integer number, counts the number of given integer in the array
     * @param a int array
     * @param apple integer number
     * @return the number of given integer in the array
     */
    public static int pineapple(int[] a, int apple) {
        int pear = 0;
        for (int pine: a) {
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int i1 = a[i];
            System.out.println(i1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 8, 4, 4, 4};
        int[] list = new int[10];

        for (int i = 0; i < list.length; i++) {
            list[i]= i + 1;
        }

        System.out.println(Arrays.toString(list));

        int c = pineapple(arr, 3);
        System.out.println(c);

        int b = grapefruit(arr,5);
        System.out.println(b);

        int a = banana(arr);
        System.out.println(a);

    }
}
