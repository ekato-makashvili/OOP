package com.company;

public class Exercise4 {

    public static int indexOfMax(int[] a) {
        int theLargest = a[0];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (theLargest > a[i]) {
                theLargest = a[i];
            }
            index = i;
        }
        return index;
    }

    public static void main(String[] args) {
        int [] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = i +1;
            System.out.println(list[i]);

        }
        int max = indexOfMax(list);
        System.out.println(max);

    }
}
