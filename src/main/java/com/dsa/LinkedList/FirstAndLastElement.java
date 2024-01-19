package com.dsa.LinkedList;

import java.util.Arrays;

public class FirstAndLastElement {


    public static void main(String[] args) {
        int[] nums ={5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {

        int firstOccurrence = binarySearch(nums, target, true);
        int lastOccur = binarySearch(nums, target, false);

        return new int[]{firstOccurrence, lastOccur};


    }


    public static int binarySearch(int[] nums, int target, boolean isStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if(target > nums[mid]){
                start = mid + 1;
            }else{
                ans = mid;
                if (isStartIndex) {
                    end = mid - 1;
                    start =0;
                } else {
                    start = mid + 1;
                    end = nums.length - 1;
                }

            }
        }
        return ans;
    }
}
