package com.string.practice;

public class CheckPalindrom {
    public static void main(String[] args) {
        String s = "aba";
        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        System.out.println("original : " + s);
        System.out.println("reversed : " + reverse);

        if (reverse.equals(s)) {
            System.out.println("palindrom");
        } else {
            System.out.println("not palindrom");
        }
    }
}
