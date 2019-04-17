package com.company;

public class StringExercise7 {
    /**
     * Checks whether the given strings are anagrams of each other
     */

    public static boolean areAnagrams(String s1, String s2) {
        boolean b = true;
        if (s1.length() != s2.length()) {
            b = false;
        } else {
            int length = s1.length();
            int count1 = 0;
            int count2 = 0;
           for (int i = 0; i < length; i++) {
               char c = s1.charAt(i);
               for (int j = 0; j < length; j++) {
                   if (c == s1.charAt(j)) {
                       count1++;
                   }
                   if (c == s2.charAt(j)) {
                       count2++;
                   }
               }
               if (count1 != count2) {
                   b = false;
               }
           }
        }
        return b;
    }

    public static void main(String[] args) {
        boolean b = areAnagrams("salu o", "olah s");
        System.out.println(b);


    }
}
