package com.string.practice;

public class JavaProgram {
    public static void main(String[] args) {
        String s = "coding";

        if (s.length() >= 3) {
            String sub = s.substring(s.length() - 3, s.length());
            for (int i = 0; i < 4; i++) {
                System.out.print(sub + " ");
            }
        }
    }
}
