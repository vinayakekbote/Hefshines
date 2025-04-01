package com.string.practice;

class MyClass {
    //StartOfMainMethod
    public static void main(String[] args) {
        Clock clock = new Clock(12, 59, 59);
        clock.increaseSecond();
        System.out.println(clock);
        clock.increaseMinute();
        System.out.println(clock);
        clock.increaseHour();
        System.out.println(clock);
    }
//EndOfMainMethod
//write your code here
}

class Clock {
    int s;
    int m;
    int h;

    Clock(int s, int m, int h) {
        this.s = s;
        this.m = m;
        this.h = h;
    }

    public void increaseSecond() {
        if (++s == 60) {
            s = 1;
        }
    }

    void increaseMinute() {
        if (++m == 60) {
            m = 1;
        }
    }

    void increaseHour() {
        if (++h == 60) {
            h = 1;
        }
    }

    public void to() {
        System.out.println(h + ":" + m + ":" + s);
    }
}
