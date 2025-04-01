package com.string;

public class RemoveDuplicateSway {
    public static void main(String[] args) {
        String s = "ddjndujkvn";
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            boolean b = false;
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    b = true;
                    break;
                }
            }
            if (!b) {
//                System.out.println(s.charAt(i));
                s2.append(s.charAt(i));
            }
        }
        System.out.println(s2);
    }
}
