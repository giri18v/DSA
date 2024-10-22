package com.dsa.Recursion;


import java.util.ArrayList;
import java.util.List;

public class HouseRobber {

    public static void main(String[] args) {

        int[] nums = {5,1,2,6};
        System.out.println(rob(nums));
    }



    public static int rob(int[] nums) {

        return robHelper(nums,nums.length-1) ;

    }

    public static int robHelper(int[] nums,int index) {

        if(index == 0){
            return nums[0];
        }

        if(index == 1){
            return Math.max(nums[0],nums[1]);
        }
        List<Integer> dp = new ArrayList<>();
        dp.add(nums[0]);
        dp.add(Math.max(nums[0],nums[1]));

        for(int i=2;i<nums.length;i++){
            dp.add(Math.max(nums[i]+dp.get(i-2),dp.get(i-1)));
        }

        return dp.get(nums.length-1);


    }

}
