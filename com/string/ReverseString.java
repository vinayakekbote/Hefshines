package com.string;
//wap to reverse string

public class ReverseString {
    public static void main(String[] args) {
        String s1 = "abcd";
        char[] s = s1.toCharArray();

        for (int i = 0; i < s.length / 2; i++) {
            char c = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = c;
        }

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        //wap string is pallindrom or not
    }
}
