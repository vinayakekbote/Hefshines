package com.string.stringbuffer;

public class Capacity {

    //formula of capacity : capacity*2+2

    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        s.append("HellooooooooooooooHellooooooooooooooyt");
        System.out.println(s.capacity());
    }
}