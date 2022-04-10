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
        int index = 0;
        int count = 0;
        while(index < s.length()){
            if (Character.isUpperCase(s.charAt(index))) {
                count++;
            }
            index++;
        }
        return count;
    }
}
