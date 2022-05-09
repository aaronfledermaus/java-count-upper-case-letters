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
        char[] sc = s.toCharArray();
        int x = 0;
        for (int i = 0; i < sc.length; i++) {
            if (sc[i] >= 'A' && sc[i] <= 'Z') {
                x++;
            }
        }
        return x;
    }
}
