package com.dsa.maths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintAllDivisors {


    public static void main(String[] args) {
        System.out.println(printAllDivisors(36));
        System.out.println(printAllDivisors2(36));


    }


    //NlogN complexity
    public static List<Integer> printAllDivisors(int num) {
        List<Integer> finalList = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                finalList.add(i);
            }
        }
        return finalList;
    }


    public static List<Integer> printAllDivisors2(int num) {
        List<Integer> finalList = new ArrayList<>();
        for (int i = 1; i*i <= num; i++) {
            if (num % i == 0) {
                finalList.add(i);
                if(num/i !=i){
                    finalList.add(num/i);
                }
            }
        }
        Collections.sort(finalList);
        return finalList;
    }





}
