package com.dsa.leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class GroupAnagrams_LC_49 {


    public static void main(String[] args) {

        String[] words ={"eat","tea"};

        HashMap<String,Integer> hashMap = new HashMap<>();
        for(String str: words){
            hashMap.put(str,hashMap.getOrDefault(str,0)+1);
        }
        System.out.println(hashMap.size());

    }


    public List<List<String>> groupAnagrams(String[] strs) {

        return null;
    }
}
