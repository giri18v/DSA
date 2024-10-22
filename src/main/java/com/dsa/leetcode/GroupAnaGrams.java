package com.dsa.leetcode;

import java.util.*;

public class GroupAnaGrams {

    public static void main(String[] args) {
        String[] strs ={"eat","tea","tan","ate","nat","bat"};
      //  System.out.println(groupAnagrams(strs));
        System.out.println(groupAnagramsOptimized(strs));
    }


    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> finalList = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();

        for(String str : strs){

            char[] sorted = str.toCharArray();
            Arrays.sort(sorted);
            String word = new String(sorted);
            List<String> listOfStrings = new ArrayList<>();
            if(!map.containsKey(word)){
                listOfStrings.add(str);
                map.put(word,listOfStrings);
            }else{
             listOfStrings = map.get(word);
                listOfStrings.add(str);
                map.put(word,listOfStrings);
            }
        }

        for(Map.Entry<String,List<String>> listMap : map.entrySet()){
            finalList.add(listMap.getValue());

        }
        return finalList;
    }


    public static List<List<String>> groupAnagramsOptimized(String[] strs) {
        List<List<String>> finalList = new ArrayList<>();


        HashMap<HashMap<Character, Integer>, List<String>> tempMap = new HashMap<>();
        for (String str : strs) {
            HashMap<Character, Integer> frequencyMap = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (frequencyMap.containsKey(ch)) {
                    frequencyMap.put(ch, frequencyMap.get(ch) + 1);
                } else {
                    frequencyMap.put(ch, 1);
                }
            }
            List<String> list = new ArrayList<>();
            if (tempMap.containsKey(frequencyMap)) {
                list = tempMap.get(frequencyMap);
                list.add(str);
                tempMap.put(frequencyMap, list);
            } else {
                list.add(str);
                tempMap.put(frequencyMap, list);
            }


        }


        for (Map.Entry<HashMap<Character, Integer>, List<String>> map : tempMap.entrySet()) {
            finalList.add(map.getValue());

        }


        return finalList;


    }


    }
