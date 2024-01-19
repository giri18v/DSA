package com.dsa.assignments;

public class Recursion1 {


    public static void main(String[] args) {

      //  System.out.println(fibo(5));
        //0 1 1 2 3 5 8
       // printNumbers(10);
        //System.out.println(factorial(5));
        System.out.println(sumOfDigits(1234));
    }

    static int fibo(int n){

        if(n < 2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);

    }

    static void printNumbers(int n){
        if(n==0){
            return;
        }
        printNumbers(n-1);
        System.out.println(n);
    }

    static int factorial(int n){
        if(n==1){
            return 1;
        }

        return n*factorial(n-1);
    }

    static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }


        return n%10+sumOfDigits(n/10);
    }

}
