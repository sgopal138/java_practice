package com.practice.corejava.array;

public class MoveZeroAtEnd {

    private static void moveZeroAtEnd(int[] arr, int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            if (arr[j] != 0) {
                j++;
            }
        }

        for (int k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 12, 0, 3, 0, 5};
        moveZeroAtEnd(arr, arr.length);
    }
}
