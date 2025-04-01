package com.string.stringbuffer;

public class CapacityCheck {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        s.append("a");//16
        System.out.println("one: length:" + s.length() + " capacity: " + s.capacity());

        s.append("aaaaaaaaaaaaaaaa");//16 c added
        System.out.println("two: length:" + s.length() + " capacity: " + s.capacity());

        s.append("aaaaaaaaaaaaaaaaaa");//17 c added
        System.out.println("three: length:" + s.length() + " capacity: " + s.capacity());

        s.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");//36 c added
        System.out.println("four: length:" + s.length() + " capacity: " + s.capacity());
    }
}

