package com.dsa.maths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeNumber {


    public static void main(String[] args) {
        System.out.println(primeNumber(7));
    }


    public static boolean primeNumber(int num) {
        int counter = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                counter++;
                if (num / i != i) {
                    counter++;
                }
            }
        }
        if (counter == 2) {
            return true;
        } else {
            return false;
        }
    }
}
