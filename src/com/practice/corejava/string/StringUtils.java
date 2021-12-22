package com.practice.corejava.string;

public class StringUtils {

    public static void main(String[] args) {
//        System.out.println(reverseString("Suraj"));

        toCamelCase("My_name_is_suraj");
    }

    private static String reverseString(String str) {
        String reveseString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reveseString += str.charAt(i);
        }
        return reveseString;
    }

    private static void reverseWord(String str) {
        String[] strArr = str.split(" ");
        String reverseString = "";

        for (int i = 0; i<strArr.length; i++) {
            String word = strArr[i];
            String reverseWord = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord += word.charAt(j);
            }
            reverseString += reverseWord +" ";
        }
        System.out.print(reverseString);
    }

    private static String toCamelCase(String inputString){
        StringBuilder builder = new StringBuilder(inputString.length());

        String[] inputStringArray = inputString.split("_");
        for(String word: inputStringArray){
            builder.append(Character.toUpperCase(word.charAt(0))).
                    append(word.substring(1).toLowerCase());
        }
        System.out.println(builder.toString());
        return builder.toString();
    }
}
