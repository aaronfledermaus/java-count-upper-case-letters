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
        char[] c = s.toCharArray();
        int cu=0;
        for(int i=0; i<c.length; i++){
            if(c[i]>='A'&&c[i]<='Z')
              cu++;
        }
        return cu;
    }
}
