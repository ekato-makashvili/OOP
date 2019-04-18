package com.company;

public class StringExercase8 {

    /**
     * Takes two strings and checks whether the set of tiles can spell the word
     */
    public static boolean canSpell(String tileSet, String word) {
        boolean b = true;
        int length1 = tileSet.length();
        int length2 = word.length();
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < length2; i++) {
            b = false;
            char c = word.charAt(i);
            for (int j = i; j < length1; j++) {
                char t = tileSet.charAt(j);
                if (c == t) {
                    b = true;
                    break;
                }
            }
        }
        return b;
    }
    public static void main(String[] args) {
        boolean b = canSpell("jndonwnilp", "windkow");
        System.out.println(b);

    }
}
