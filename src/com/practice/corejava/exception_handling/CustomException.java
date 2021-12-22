package com.practice.corejava.exception_handling;

class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);
    }
}

public class CustomException {

    static void validate(int age) throws InvalidAgeException {
        if(age < 18){
            throw new InvalidAgeException("Invalid Age");
        } else {
            System.out.println("Valid Age");
        }
    }

    public static void main(String[] args) {
        try {
            validate(120);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
