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
        int num = 0, sign = 0;
        while (sign < s.length()) {
            if (s.charAt(sign) >= 'A' && s.charAt(sign) <= 'Z') {
                num++;
            }
            sign++;
        }
        return num;
    }
}
