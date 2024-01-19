package com.dsa.LinkedList;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr ={3,4,2,5,1};
        int[] result = selectionSort(arr);
       System.out.println(Arrays.toString(result));
    }

    static int[] selectionSort(int[] nums){
        // [3,4,2,5,1]
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] < nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }


}
