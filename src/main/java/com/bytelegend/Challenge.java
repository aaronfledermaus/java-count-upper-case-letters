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
        char ch[] = s.toCharArray();
        int n = ch.length;
        int i = 0;
        int count = 0;
        do {
            if (isNumbers(ch[i])) {
            } else {
                count++;
            }
            i++;
        } while ((n--) > 1);
        return count;
    }

    public static boolean isNumbers(char c) {
        if ((int) c >= 48 && (int) c <= 57) return true;
        else return false;

    }
}
