package com.dsa.Recursion;

public class CheckArraySorted {


    public static void main(String[] args) {
        int[] nums ={1,2,4,5,7,18,9,10};

        System.out.println(isSorted(nums));


    }

    static boolean isSorted(int[] nums){

        return isSortedHelper(nums,0);
    }

    static boolean isSortedHelper(int[] nums,int index){

        if(index == nums.length-1){
            return true;
        }
        if(nums[index] < nums[index+1]){
          return isSortedHelper(nums,index+1);
        }

        return false;
    }
}
