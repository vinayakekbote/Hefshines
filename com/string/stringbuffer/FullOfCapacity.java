package com.string.stringbuffer;

public class FullOfCapacity {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        s.append("hefshine");
        System.out.println(s.capacity());
        s.ensureCapacity(100);
        System.out.println(s.capacity());
//        System.out.println(s.reverse());
        System.out.println(s.delete(3, s.length()));
        System.out.println(s.append("shine"));
        s.setCharAt(1, 'E');
        System.out.println(s);
    }
}
