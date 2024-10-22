package com.dsa.leetcode;

import java.util.ArrayList;
import java.util.List;

public class DP2 {

    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {

        return robHelper(nums,nums.length-1) ;

    }


    public static int robHelper(int[] nums,int index) {
        List<Integer> dp = new ArrayList<>();
        dp.add(nums[0]);
        dp.add(Math.max(nums[0],nums[1]));

        for(int i=2;i<nums.length;i++){
            dp.add(Math.max(nums[i]+dp.get(i-2),dp.get(i-1)));
        }

        return dp.get(nums.length-1);


    }
}
