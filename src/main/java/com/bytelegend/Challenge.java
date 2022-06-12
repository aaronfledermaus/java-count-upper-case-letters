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
        int a = s.length();
        int b = 0, c = 0;
        while (a > 0) {
            if (Character.isUpperCase(s.charAt(b))) {
                c++;
            }
            b++;
            a--;
        }
        return c;
    }
}
