package com.dsa.leetcode;

public class ContZerosInANumberRecursion {


    public static void main(String[] args) {
        System.out.println(countZeros(12340900));
    }


    static int countZeros(int n){

        return helper(n,0);

    }

    static int helper(int n, int count){
        if(n == 0){
            return count;
        }
        int remainder = n%10;
        if(remainder == 0){
           return helper(n/10,count+1);
        }

        return helper(n/10,count);
    }
}
