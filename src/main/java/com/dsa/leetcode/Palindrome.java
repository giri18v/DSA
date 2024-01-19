package com.dsa.leetcode;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

    }

    // Simple solution for removing the extra space and special charcters.
    public static boolean isPalindrome(String s) {

        int start = 0;
        s =s.toLowerCase().replaceAll("[^a-z0-9]","");
        int end = s.length()-1;

        while(start <= end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }


        return true;



        // This solution is also correct , but takes too much time for the longer String
        /*while(start <=end){
            if(!Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }else if(!Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }else if(s.toLowerCase().charAt(start) != s.toLowerCase().charAt(end)){
                return false;
            }else {
                start++;
                end--;
            }
        }

        return true;
        */




    }



}
