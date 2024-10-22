package com.dsa.leetcode;

public class PowerOfTwo {


    public static void main(String[] args) {
        System.out.println(solve(1));
    }
        static boolean  solve(int n) {
            if(n==0){
                return true;
            }
            while(n!=1){
                if(n%2 != 0){
                    return false;
                }
                n=n/2;
            }

            return true;

        }
    }

