package com.dsa.leetcode;

public class LongestCommonPrefix {

    public static void main(String[] args) {
           String[] str = {"flower","flow","flight"};
        System.out.println(commonPrefix(str));
    }


    public static String commonPrefix(String[] str){

        if(str.length == 0) {
            return "";
        }
        String prefix = str[0];
        for(int i=1;i<str.length;i++){
            System.out.println(str[i].indexOf(prefix));
            while(str[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;

    }
}
