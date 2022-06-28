package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(countUpperCaseLetters("AaBbCc1234ABC"));
        System.out.println(countUpperCaseLetters("1A2B3C4d"));
    }

    /**
     * `countUpperCaseLetters()` method returns the number of upper case letters in the given
     * English string.
     *
     * <p>For example, `countUpperCaseLetters("1A2B3C4d")` returns `3`.
     */
    public static int countUpperCaseLetters(String s) {
        char ch[] = s.toCharArray();
        int n = ch.length;
        int i = 0, count = 0;
        do {
            if (isBigWord(ch[i])) {
                count++;
            }
            i++;
        } while ((n--) > 1);
        return count;
    }

    public static boolean isBigWord(char c) {
        return c >= 'A' && c <= 'Z';
    }
}
