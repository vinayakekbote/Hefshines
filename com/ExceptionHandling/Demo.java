package com.ExceptionHandling;

public class Demo {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c;

        try {
            c = a / b;
            System.out.println(c);
            System.out.println("Hello");
        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
