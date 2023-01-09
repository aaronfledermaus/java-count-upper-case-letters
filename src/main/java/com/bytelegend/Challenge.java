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
        int i = 0, n = 0;
        do {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                n++;
            }
            i++;
        } while (i < s.length());
        return n;
    }
}
