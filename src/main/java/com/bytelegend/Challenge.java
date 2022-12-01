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
        char[] chars = s.toCharArray();
        int index = 0;
        int i = 0;
        do {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                index++;
            }
            i++;
        } while (i <= chars.length - 1);

        return index;
    }
}
