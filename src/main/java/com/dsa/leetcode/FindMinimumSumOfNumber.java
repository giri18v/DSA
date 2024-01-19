package com.dsa.leetcode;

import java.util.Arrays;

class FindMinimumSumOfNumber {
    //num = 2932
    // If we see this num , by thinking if we sort the elements we may able to achieve the results.
    // First need to create a array of the nums length , which is by default 4. as per the question
    // add the elements into array by taking modulo by 10.
    // Sort the array
    // then use this formula num1 = d2+b1*10 , num2=d3+a1*10;  
    //finally return the result by combining both elements
    //OR add both formulas like(d2+d3+(a1xb1)10) and return 
    public static void main(String[] args) {

        System.out.println(minimumSum(2932));
    }

    public static int minimumSum(int num) {

        int[] arr = new int[4];
        int i=0;
        while(num >0){
            int a = num%10;
            num =num/10;
            arr[i++] = a;
        }

        Arrays.sort(arr);

        int num1 = arr[2] + arr[0]*10;
        int num2 = arr[3] + arr[1]*10;
        return num1+num2;
        
    }
}