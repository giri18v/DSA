package com.dsa.leetcode;

import java.util.Arrays;

public class CountSort {

    public static void main(String[] args) {

        int[] nums = {8,1,2,2,3};

        System.out.println(Arrays.toString(countSort(nums)));
    }
    // Step 1 : find the max element in the array
    // Step 2 : Create a new array of maxelement+1
    //Step 3: Iterate over original array and put the frequency of it.
    //Step 4: iterate over the max element and modify the original array if the count is greater than 0.
    //Step 5 : return the array.



    public static int[] countSort(int[] nums){
        int max = nums[0];
        //Step 1
        for(int element : nums){
            if(element > max){
                max = element;
            }
        }
        // Step2

        int[] frequency = new int[max+1];
        //Step3
        for(int element : nums) {
            frequency[element]++;
        }

        System.out.println(Arrays.toString(frequency));
        //[0,1,2,1,0,0,0,0,1] -->Frequency
        //[0,1,2,3,4,5,6,7,8] -- >Index
        //Step 4
        int count = 0;
        for(int i=0;i<=max;i++){
            while(frequency[i] > 0){
            nums[count] = i;
            count++;
            frequency[i]--;
            }

        }

        return nums;

    }
}
