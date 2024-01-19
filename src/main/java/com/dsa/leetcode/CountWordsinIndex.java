package com.dsa.leetcode;

import java.util.Arrays;

public class CountWordsinIndex {

    // Find the max element
    // create and put the frequency of values
    // Add the cumulative frequency by adding the previous value.
    // Iterate the nums and get the vales from frequencyArr based on nums[i]


    public static void main(String[] args) {

        int[] arr ={8,1,2,2,3};
        System.out.println(Arrays.toString(countSort(arr)));

    }

    public  static int[] countSort(int[] nums){
        int max = nums[0];

        for(int num : nums){
            if(num > max){
                max = num;
            }
        }

        int[] frequencyArr = new int[max+1];

        for(int num :nums){
            frequencyArr[num]++;
        }
        for(int i=1;i<frequencyArr.length;i++){
           frequencyArr[i]+=frequencyArr[i-1];
        }

        System.out.println(Arrays.toString(frequencyArr));
        //[0, 1, 3, 4, 4, 4, 4, 4, 5]
        for(int i=0;i<nums.length;i++){

            if(nums[i] == 0){
                nums[i] =0;
            }else {
                nums[i] = frequencyArr[nums[i]-1];
            }
        }

        return nums;

    }


}
