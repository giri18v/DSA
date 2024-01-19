package com.dsa.assignments;

public class LongestPalindrome {

    public static void main(String[] args) {

        System.out.println(longestPalindrome("aaaa"));

    }

    public static String longestPalindrome(String str) {
        int strLength = str.length();
        if(strLength < 2){
            return "";
        }
        String maxStr = str.substring(0, 1);

        for(int i=0;i<strLength;i++){
           String oddCheck = expandRange(str,i,i);
           String evenCheck = expandRange(str,i,i+1);
           if(oddCheck.length() > maxStr.length()){
               maxStr = oddCheck;
           }
           if(evenCheck.length() > maxStr.length()){
               maxStr = evenCheck;
           }

        }
        return maxStr;

    }

    public static String expandRange(String str , int startIndex,int endIndex){

        while(startIndex >=0 && endIndex < str.length() && str.charAt(startIndex) == str.charAt(endIndex)){
            startIndex--;
            endIndex++;
        }
        //startIndex+1 is because of the above start--
        return str.substring(startIndex+1,endIndex);

    }

}
