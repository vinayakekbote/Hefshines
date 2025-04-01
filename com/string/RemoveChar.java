package com.string;

public class RemoveChar {
    public static void main(String[] args) {
        String c = "abc";
        char ch = 'x';

        int count = 0;
        for (int i = 0; i < c.length(); i++) {
            if (ch != c.charAt(i)) {
                System.out.println(c.charAt(i));
            } else {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("not present : " + ch);

        }
    }
}
