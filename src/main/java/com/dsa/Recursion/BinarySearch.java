package com.dsa.Recursion;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums ={2,4,7,9,10,54,66,77};
        System.out.println(binarySearch(nums,70));
    }


    static int binarySearch(int[] nums,int target){

            return binarySearchHelper(nums,target,0,nums.length);

    }


    static int binarySearchHelper(int[] nums,int target, int start,int end){
        // Two things
        //1.Compare the mid element is equal to target
        //2.If not divide the space.
        // F(N) = F(N/2)
        // Arguments start , end

        //base case
        if(start > end){
            return -1;
        }
        int mid = start+(end-start)/2;

        if(nums[mid] == target){
            return mid;
        }

        if(target < nums[mid]){
            return binarySearchHelper(nums,target,start,mid-1);
        }else {
            return binarySearchHelper(nums,target,mid+1,end);
        }
    }
}
