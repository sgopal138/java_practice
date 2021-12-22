package com.practice.corejava.array;

import java.util.HashMap;
import java.util.Map;

public class ArrayUtils {

    public static void main(String[] args) {
        int[] arr = {1,4,20,3,10,5};
        int[] reverseArr = reverseArray(arr, 0, arr.length - 1);

//        printArray(reverseArr);

//        System.out.println(minimumValue(arr));

      /* int[] resizeArr = resizeArray(arr, 10);
        printArray(resizeArr);*/

sumOfMatches(arr, 33);

        /*int[][] arr1 = {{12, 2, 3, 6}, {9, 4, 1, 7}};
        printMultiArray(arr1);*/

//        findSecondLagest(arr);

    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int[] reverseArray(int[] arr, int start, int end) {
        /*if(arr.length > 1){
            while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }*/
        int[] reverseArr = new int[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.println(arr[i]);
            reverseArr[index] = arr[i];
            index++;
        }

        return reverseArr;
    }

    private static int minimumValue(int[] arr) {
        int minVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minVal)
                minVal = arr[i];
        }
        return minVal;
    }

    // move Zeroes to end of an Array

    private static void moveZeroAtEnd(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[j] == 1) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 1)
                j++;
        }
    }

    private static int[] resizeArray(int[] arr, int capacity) {
        int[] tempArr = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            tempArr[i] = arr[i];
        }
        return tempArr;
    }

    //sum of index position that matches with target
    private static int[] sumOfMatches(int[] arr, int target) {
        int[] indexArr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(target - arr[i])) {
                map.put(arr[i], i);
            } else {
                indexArr[1] = i;
                indexArr[0] = map.get(target - arr[i]);
            }
        }
        System.out.println("{" + indexArr[0] + "," + indexArr[1] + "}");
        return indexArr;
    }

    //Multi Dimensional Array
//    int [][] arr = {{12,2,44,3}, {9,4,1,7}};
    private static void printMultiArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int findSecondLagest(int[] arr) {
        int first, second;

        if (arr[0] > arr[1]) {
            first = arr[0];
            second = arr[1];
        } else {
            first = arr[1];
            second = arr[0];
        }

        for(int i = 2; i<arr.length; i++){
            if(arr[i] > first){
                second = first;
                first = arr[i];
            }
        }
        System.out.println("first = " + first + ", second = " + second);
        return second;
    }
}
