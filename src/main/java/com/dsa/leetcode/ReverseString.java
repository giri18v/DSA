package com.dsa.leetcode;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println(reverseWords("  blue   is sky  "));
    }


        public static String reverseWords(String s) {

            int i =0;
            String result ="";
            int n=s.length();
            while(i<n){
                while(i<n && s.charAt(i)==' '){
                    i++;
                }
                if(i>=n){
                    break;
                }
                int j=i+1;

                while(j<n && s.charAt(j) != ' '){
                    j++;
                }
                String str = s.substring(i,j);
                if(result.length()==0){
                    result = str;
                }else{
                    result = str+" "+result;
                }
                i=j+1;
            }

            return result;

        }
}

