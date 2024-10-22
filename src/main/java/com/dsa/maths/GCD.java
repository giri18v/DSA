package com.dsa.maths;

public class GCD {

    public static void main(String[] args) {
        System.out.println(findGCD(25,55));
    }


    public static int findGCD(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        } else {
            return a;
        }
    }
}
