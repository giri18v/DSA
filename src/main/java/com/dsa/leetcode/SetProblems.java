package com.dsa.leetcode;


import java.util.HashSet;
import java.util.Set;

public class SetProblems {


    public static void main(String[] args) {
        String[] words ={"ad","bd","aaab","baa","badab"};
        System.out.println(countConsistentStrings("ab",words));
    }

    public static int countConsistentStrings(String allowed, String[] words) {

        int result = words.length;
        Set<Character> set = new HashSet<>();
        for(char ch: allowed.toCharArray()){
            set.add(ch);
        }

        for(String str : words){
            if(set.contains(str)){
                result = result-1;
            }
        }


        return result;

    }
}
