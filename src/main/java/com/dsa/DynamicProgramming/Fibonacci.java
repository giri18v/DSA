package com.dsa.DynamicProgramming;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci2(10));
    }

    static int fibonacci(int n){

        //BruteForce
        /*if(n<2){
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);*/

        int[] dp = new int[n+1];
        dp[0] =0;
        dp[1] =1;

        for (int i = 2; i <= n; i++) {
            dp[i] =dp[i-1]+dp[i-2];
        }

        return dp[n];
    }

    static int fibonacci2(int n){

        if(n<2){
            return n;
        }

        int[] dp = new int[n+1];
        if(n == dp[n]){
            return dp[n];
        }

        dp[n] = fibonacci(n-1) +fibonacci(n-2);

        return dp[n];

    }

}
