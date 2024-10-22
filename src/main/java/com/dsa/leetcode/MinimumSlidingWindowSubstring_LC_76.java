package com.dsa.leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MinimumSlidingWindowSubstring_LC_76 {


    public static void main(String[] args) {
        String s="ADOBECODEBANC";
        String t ="ABC";

        System.out.println(minWindow(s,t));

        String[] str ={"a","b"};
        int i = str.length;

    }




    public static String minWindow(String s, String t) {
        int i =0 ,j=0,start=-1,minWindow = Integer.MAX_VALUE,counter=0;

        HashMap<Character,Integer> hashMap= new HashMap<>();

        for(char c : t.toCharArray()){
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
        }

        while(j < s.length()){
            char ch = s.charAt(j);
            if(hashMap.containsKey(ch)){
                hashMap.put(ch,hashMap.get(ch)-1);
                if(hashMap.get(ch) >= 0){
                    counter++;
                }
            }
            j++;

            while(counter == t.length()){
                char c = s.charAt(i);
                if(j-i < minWindow){
                    minWindow = j-i;
                    start = i;
                }
                if(hashMap.containsKey(c)){
                    hashMap.put(c , hashMap.get(c)+1);
                    if(hashMap.get(c) > 0){
                        counter--;
                    }
                }
                i++;

            }

        }


        return minWindow == Integer.MAX_VALUE ? "" : s.substring(start,start+minWindow);


    }
}
