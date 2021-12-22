package com.practice.corejava.interview;

public class ReverseString {

    public static void main(String[] args) {

        String s = "suraj";
        String reverseString = "";
        for(int i = s.length()-1; i>=0; i-- ){
            reverseString = reverseString + s.charAt(i);
        }
        System.out.println(reverseString);
    }
}
