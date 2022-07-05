package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(countUpperCaseLetters("AaBbCc1234ABC"));
    }

    /**
     * `countUpperCaseLetters()` method returns the number of upper case letters in the given
     * English string.
     *
     * <p>For example, `countUpperCaseLetters("1A2B3C4d")` returns `3`.
     */
    public static int countUpperCaseLetters(String s) {
        if (s == null) {
            return 0;
        }

        char[] parts = s.toCharArray();
        int count = 0;
        int i = 0;

        while (i < parts.length) {
            if (Character.isUpperCase(parts[i])) {
                count++;
            }
            i++;
        }

        return count;
    }
}
