package com.string.stringmethods;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = "V s";
        String reenterPass = "v s";

        String password = " b";
        //isEmpty() or isBlank()
        if (username.isBlank() || password.isBlank()) {
            System.out.println("Plese enter the username and password");
        } else {
            System.out.println("Successfully log in");
        }
        //equals()
        System.out.println(username.equals(reenterPass));

        //equalsIgnoreCase()
        System.out.println(username.equalsIgnoreCase(reenterPass));

        String s = "bbc";
        String s1 = "dbc";

        //ascii value of A to Z is 65 to 91
        //ascii value of a to z is 97 to 122

        //compareTo() -  compare the ascii value of perticular char in string
        System.out.println("compareTo : " + s1.compareTo(s));
        System.out.println("compareToIgnoreCase : " + s.compareToIgnoreCase(s1));

        //contains - check word is present or not in string
        System.out.println("contains : " + ("this is java".contains("java")));

    }
}
