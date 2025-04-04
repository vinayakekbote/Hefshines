package com.string.practice;

public class Demo {
    public static void main(String[] args) {
        String date = "2002-04-01";
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        System.out.println((year * 365) + (month * 12) + (day * 30));
    }

}
