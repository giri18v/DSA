package com.dsa.Recursion;

public class FindTargetElement {

    public static void main(String[] args) {

        int[] nums = {2,4,5,6,7,9,19};

        System.out.println(findTarget(nums,199));
    }


    static int findTarget(int[] nums, int target){

        return findTargetHelper(nums,target,0);
    }


    static int findTargetHelper(int[] nums,int target,int index){
        if(index == nums.length){
            return -1;
        }
        if(nums[index] == target){
            return index;
        }

        return findTargetHelper(nums,target,index+1);
    }
}
