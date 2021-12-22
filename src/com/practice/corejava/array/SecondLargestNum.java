package com.practice.corejava.array;

public class SecondLargestNum {

    private static int getSecondLargestNumber(int[] arr) {
        int largestNum = arr[0];
        int secondLargestNum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestNum) {
                secondLargestNum = largestNum;
                largestNum = arr[i];
            } else if (arr[i] > secondLargestNum) {
                secondLargestNum = arr[i];
            }
        }
        return secondLargestNum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 6, 8, 7};
        System.out.println(getSecondLargestNumber(arr));
    }
}
