package com.dsa.leetcode;

public class FindIndexOfFirstOccurence_LC28 {


    public static void main(String[] args) {
       String  haystack = "sadbutsad", needle = "bad";
       //Output =0;
        System.out.println(firstOccurance(haystack,needle));

    }


    public static int firstOccurance(String haystack,String needle){

        for (int i = 0; i < haystack.length()-needle.length()+1; i++) {
               if(haystack.charAt(i) == needle.charAt(0)){
                   if(haystack.startsWith(needle, i))
                       return i;
               }

        }


        return -1;
    }




}
