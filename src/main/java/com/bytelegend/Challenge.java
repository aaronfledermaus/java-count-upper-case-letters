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

        int uppers = 0;
        char[] letters = s.toCharArray();
        int i = 0;

        do {
            if (letters[i] >= 'A' && letters[i] <= 'Z') {
                uppers++;
            }
            i++;
        } while (i < s.length());

        return uppers;
    }
}
