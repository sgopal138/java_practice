package com.practice.corejava.interview;

public class Swap {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        a = a+b;
        b = a - b;
        a = a - b;

        System.out.println("a : " + a +", b : " + b);
    }
}
