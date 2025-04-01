package com.string.practice;

public class P1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 10; i += 2) {
            if (i == 9) break;
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
