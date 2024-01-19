package com.dsa.assignments;

import java.util.HashSet;

public class FindOccurencesString {

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("pwwkew"));

    }


    public static int lengthOfLongestSubstring(String s) {

        HashSet<Character> hashSet = new HashSet();
        int max =0;
        int i =0;
        int j=0;
        while(j < s.length()){
            if(!hashSet.contains(s.charAt(j))){
                hashSet.add(s.charAt(j));
                j++;
                max = Math.max(hashSet.size() ,max);
            }else {
                hashSet.remove(s.charAt(i));
                i++;
            }
        }
        return max;

    }
}
