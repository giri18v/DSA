package com.dsa.LinkedList;

public class SearchInsertPos {

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6};
        System.out.println(binarySearch(nums, 2, false));


    }


    static int binarySearch(int[] nums,int target,boolean isFindingTarget){
        int start =0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start +(end - start)/2;
            if(isFindingTarget && nums[mid] == target){
                return mid;
            }else if(target < nums[mid]){
                end =mid-1;
            }else if(target > nums[mid]){
                start =mid+1;
            }
        }
        if(!isFindingTarget){
            return start;
        }
        return -1;


    }
}
