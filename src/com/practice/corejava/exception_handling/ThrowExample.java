package com.practice.corejava.exception_handling;

public class ThrowExample {
    static void validAge(int age){
        if(age < 18)
            throw new ArithmeticException("Invalid age");
        else
            System.out.print("Valid Age");
    }

    public static void main(String[] args) {
        validAge(13);
    }
}
