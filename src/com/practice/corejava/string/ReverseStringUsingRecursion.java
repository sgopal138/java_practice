package com.practice.corejava.string;

public class ReverseStringUsingRecursion {

    /**
     * Reverse Elements in a collection -
     * INPUT - A string collection ["Ram", "Sardar", "John", "Jacob"]
     * OUTPUT - A string collection ["Jacob", "John", "Sardar", "Ram"]
     * <p>
     * Constraints -
     * 1. Do not use any loop, for or while. Instead use recursion or recursive functions
     * 2. Do not use another collection object, just reverse the order in the same collection
     */

    public static void main(String[] args) {

        String[] input = {"Ram", "Sardar", "John", "Jacob"};
        int i =0;
        int j = input.length - 1;
        reverse(input, i , j);

        for (int k=0; k< input.length; k++){
            System.out.println(input[k]);
        }

    }

    private static String[] reverse(String[] inputArr, int i, int j) {

        if(j > i){
            String temp = inputArr[i];
            inputArr[i] = inputArr[j];
            inputArr[j] = temp;
            reverse(inputArr, i+1, j-1);
        }
        return inputArr;
    }
}
