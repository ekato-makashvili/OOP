package com.company;

public class StringExercise5 {

    /**
     * Returns a boolean indicating whether the word is abecedarian
     */
    public static boolean isAbcedacian(String s) {
        boolean b = true;
        char c = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            char symbol = s.charAt(i);
            if (c <= symbol) {
                c = symbol;
                b = true;
            } else {
                b = false;
                break;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        boolean b = isAbcedacian("hjkz");
        System.out.println(b);

    }
}
