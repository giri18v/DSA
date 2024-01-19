package com.dsa.assignments;

import java.util.HashMap;

public class LongestSubString {

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> charMap = new HashMap<>();
        char[] charArr = s.toCharArray();
        int count = 0;
        for(Character ch: charArr){
            if(charMap.containsKey(ch)){
                charMap.put(ch,charMap.get(ch)+1);
            }else {
                charMap.put(ch ,1);
                count =count +1;
            }
        }
        return count;

    }
}
