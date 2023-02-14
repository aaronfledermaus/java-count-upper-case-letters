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
        int result = 0;
        char[] sSplit = s.toCharArray();
        int i = 0;
        while(i<sSplit.length){
            char c = sSplit[i];
            if(c >= 'A' && c <= 'Z')
                result++;
            i++;
        }
        return result;
    }
}
