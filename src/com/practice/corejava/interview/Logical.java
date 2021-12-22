package com.practice.corejava.interview;

public class Logical {

    public static void main(String[] args) {
//        System.out.println(isPrimeNumber(19) ? "Prime Number" : "Not Prime Number");

//        printPrimeNumber(1, 20);

        reverseNumber(1234);
    }

    private static boolean isPrimeNumber(int num) {
        boolean isPrime = true;
        if (num == 0 || num == 1) {
            return false;
        } else if (num == 2) {
            return true;
        }

        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    private static void printPrimeNumber(int start, int end) {
        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            if (i == 0 || i == 1)
                continue;
            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime)
                System.out.println(i);
        }
    }


    private static void reverseNumber(int num){//1234
        int reverseNum = 0;
        while(num != 0){
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num /= 10;
        }
        System.out.println(reverseNum);
    }
}
