package com.company;

public class StringExercise6 {
    /**
     * Checks if every letter that appears in the given word appears exactly twice
     */
    public static boolean isDoubloon(String s) {
        boolean b = true;
        for (int i = 0; i< s.length(); i++) {
            int count = 0;
            char symbol = s.charAt(i);
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (symbol == c) {
                    count++;
                }
            }
            if (count != 2) {
                b = false;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        String test = "hhgavaGV";
        boolean b = isDoubloon(test.toLowerCase());
        System.out.println(b);

    }
}
