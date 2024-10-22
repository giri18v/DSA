package com.dsa.leetcode;

public class ReverseWordsInAString {


    public static void main(String[] args) {

        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {
        // Step 1  : find a char till we find a space in a String ,
        // Step 2 : Swap the elements from the starting index till jth index.

        char[] ch =s.toCharArray();
        int n=s.length();
        int i=0;
        int j=0;
        while(j<n){

            if(ch[j] == ' '){
                swap(ch,i,j-1);
                j++;
                i=j;
            }else{
                j++;
            }
            if(j ==n-1){
                swap(ch,i,j);
            }

        }

        return new String(ch);
    }


    public static char[] swap(char[] ch,int start,int end){

        while(start<end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] =temp;
            start++;
            end--;
        }
        return ch;
    }
}
