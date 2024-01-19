package com.dsa.LinkedList;

public class SearchinRotatedSortedArr {

    public static void main(String[] args) {

        int[] nums ={3,4,5,6,1,2};
        System.out.println(search(nums,0));

    }
    public static int search(int[] nums, int target) {

        int pivot = findPivot(nums);
        if(pivot == -1){
            return binarySearch(nums,target,0,nums.length-1);
        }else if(nums[pivot] == target){
            return pivot;
        }else if(nums[0] > target){
            return binarySearch(nums,target,pivot+1,nums.length-1);
        }
        return binarySearch(nums,target,0,pivot-1);


    }


    static int findPivot(int[] nums){
        int start =0;
        int end =nums.length-1;
        while(start<end){
            int mid = start+(end-start) /2;
            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }else if(mid >start && nums[mid] < nums[mid-1]){
                return mid;
            }else if(nums[start] <= nums[mid]){
                end =mid-1;
            }else {
                start =mid+1;
            }

        }
        return -1;

    }


    static int binarySearch(int[] nums,int target,int start,int end){

        while(start <= end){
            int mid = start + (end-start) /2;
            if(nums[mid] == target){
                return mid;
            }
            if(target < nums[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }

        }
        return -1;

    }
}
