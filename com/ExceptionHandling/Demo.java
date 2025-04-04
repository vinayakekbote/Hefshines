package com.ExceptionHandling;

public class Demo {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c;

        try {
            c = a / b;
            System.out.println(c);

        } catch (ArithmeticException e) {
            System.out.println("do not enter zero divisor");
        } catch (Exception e) {
            System.out.println(e);
        } finally {//finally block is always executed
            System.out.println("Hello");
        }
    }
}
