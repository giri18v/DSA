package com.dsa.leetcode;

import java.util.HashMap;

public class WordPattern_LC_290 {

    public static void main(String[] args) {

        String pattern ="abba";

        String s ="dog cat cat dog";

        System.out.println(wordPattern(pattern,s));


    }


    public static boolean wordPattern(String pattern, String s) {

        String[] words =s.split(" ");

        if(words.length != pattern.length()){
            return false;
        }

        HashMap<Character,String> map = new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            char key =pattern.charAt(i);
            String value = words[i];
            if(!map.containsKey(key)){
                if(!map.containsValue(value)){
                    map.put(key,value);
                }else{
                    return false;
                }
            }else {
                if(!map.get(key).equals(value)){
                    return false;
                }
            }

        }
        return true;
    }


}
