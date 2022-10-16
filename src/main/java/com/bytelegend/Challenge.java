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
        char[] ch = s.toCharArray();
        int i = 0;
        int cnt = 0;
        while (i < ch.length) {
            if (ch[i] >= 'A' && ch[i] <= 'Z')
                cnt++;
            i++;
        }
        return cnt;
    }
}
