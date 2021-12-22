package com.practice.corejava.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CharOccurance {

    public static void main(String[] args) {
        Map<Character, Integer> map = getFrequency("india");

        Set<Character> keys = map.keySet();

        int maxCount = 0;

        for(char key: keys){
            if(map.get(key) > maxCount){
                maxCount = map.get(key);
            }
//            System.out.println("Key : " + key + ", value: " + map.get(key));
        }



        System.out.println(maxCount);
    }

    private static Map<Character, Integer> getFrequency(String inputString){
        Map<Character, Integer> map = new HashMap<>();

        char[] charArray = inputString.toCharArray();

        for(int i=0; i<charArray.length; i++){
            if(map.containsKey(charArray[i])){
                map.put(charArray[i], map.get(charArray[i]) + 1);
            } else {
                map.put(charArray[i], 1);
            }
        }
        return map;
    }
}
