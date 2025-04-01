package com.string.practice;

public class CharFrequancyTracker {
    public static void main(String[] args) {

        String s = "aabb";

        for (int i = 0; i < s.length(); i++) {  //0<4 1<4 2<4 3<4 4<4f
            int count = 0;

            for (int j = 0; j < i; j++) {
                //it 1 0<0f

                //it 2 0<1 1<1f

                //it 3 0<2 1<2 2<2f

                //it 4 0<3 1<3 2<3 3<3f


                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                    //it 2 c=1 break;
                    //it 4 c=1 break;
                    break;
                }
            }
            if (count == 0) {
                //it 1 c=0 a=0
                //it 3 c=0 b=0
                int c = 0;
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        //a==0 1
                        //b==2 3
                        c++;
                    }
                }
                System.out.println(s.charAt(i) + " " + c);
                //op = a 2
                //op = b 2
            }
        }
    }
}
