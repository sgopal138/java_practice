package com.practice.corejava.star_pattern;

public class StarPattern {

    public static void main(String[] args) {
        design4(5);
    }

    /*
     *
     **
     ***
     ****
     */
    private static void design1(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     *****
     ****
     ***
     **
     *
     */

    private static void design2(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     *
     **
     ***
     ****
     */

    private static void design3(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            ;
            System.out.println();
        }
    }


    /*
     *****
     ****
     ***
     **
     *

     */
    private static void design4(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = num; k > i; k--) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

}

