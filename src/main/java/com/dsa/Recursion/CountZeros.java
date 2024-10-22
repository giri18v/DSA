package com.dsa.Recursion;

public class CountZeros {


    public static void main(String[] args) {

        System.out.println(count(1234010000));
    }


    static int count(int n){

        return countHelper(n,0);

    }

    static int countHelper(int n,int count){
        if(n==0){
            return count;
        }
        if(n%10 == 0){
         return countHelper(n/10,count+1);
        }
        return countHelper(n/10,count);

    }
}
