package com.practice.corejava.array;

public class SecondLowestNum {

    private static int getSecondLowestNumber(int[] arr) {
        int lowestNum, secondLowestNum;

        lowestNum = secondLowestNum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < lowestNum) {
                secondLowestNum = lowestNum;
                lowestNum = arr[i];
            } else if (arr[i] < secondLowestNum) {
                secondLowestNum = arr[i];
            }
        }
        return secondLowestNum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 6, 8, 7};
        System.out.println(getSecondLowestNumber(arr));
    }
}
