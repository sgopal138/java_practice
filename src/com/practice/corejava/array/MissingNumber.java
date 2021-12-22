package com.practice.corejava.array;

import java.util.Arrays;

public class MissingNumber {

    //Approach 1
    private static int getMissingNumber(int[] arr, int n) {
        int length = arr.length;
        int totalSum = n * (n + 1) / 2;

        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += arr[i];
        }

        return totalSum - sum;
    }


    //Approach 2 - Using Arrays utils class
    public static int findMissingElement(int[] A) {
        int n = A.length;
        int sum = Arrays.stream(A).sum();
        return (n + 1) + n * (n + 1)/2 - sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7};

        System.out.println(getMissingNumber(arr, 7));

        System.out.println(findMissingElement(arr));
    }
}
