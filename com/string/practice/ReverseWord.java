package com.string.practice;

public class ReverseWord {
    public static void main(String[] args) {
        String s = "this is java program";

        String[] sa = s.split(" ");
        StringBuilder ss = new StringBuilder();

        for (int i = sa.length - 1; i >= 0; i--) {
            ss.append(sa[i].concat(" "));
        }
        System.out.println("SubSequeance is : " + (s.subSequence(8, s.length())));
        System.out.println("SubString is : " + (s.substring(8, s.length())));

        System.out.println(ss);
    }
}
