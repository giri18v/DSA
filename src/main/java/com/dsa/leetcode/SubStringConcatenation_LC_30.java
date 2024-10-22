package com.dsa.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubStringConcatenation_LC_30 {

    public static void main(String[] args) {

        String s ="barfoothefoobarman";
        String[] words = {"foo","bar"};

        System.out.println(findSubstring(s,words));


    }


    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result  = new ArrayList<>();
        if(s.length() == 0 || words.length == 0) return result;

        int wordlen = words[0].length();
        int length = s.length();
        int len = wordlen * words.length;

        HashMap<String,Integer> count = new HashMap<>();

        for(String str : words){
            count.put(str,count.getOrDefault(str,0)+1);
        }

        for(int i =0;i<length-wordlen+1;i++){
            int start =i;
            int current =i;
            HashMap<String,Integer> copy = new HashMap<>(count);
            while(current+wordlen < length+1){
                String currentWord =s.substring(current,current+wordlen);
                if(copy.containsKey(currentWord)){
                    copy.put(currentWord,copy.get(currentWord)-1);
                    if(copy.get(currentWord) == 0){
                        copy.remove(currentWord);
                    }
                    if(copy.size() == 0){
                        result.add(start);
                        break;
                    }
                    current+= wordlen;
                }else{
                    break;
                }
            }
        }
        return result;

    }

}
