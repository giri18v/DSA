package com.dsa.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {

        int[] nums ={-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        HashSet<List<Integer>> hashSet = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){

            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                int sum =nums[i]+nums[left]+nums[right];
                left++;
                right--;
                if(sum == 0){
                    hashSet.add(Arrays.asList(nums[i],nums[left],nums[right]));
                }else if(sum > 0){
                    right--;
                }else{
                    left++;
                }
            }

        }

        return new ArrayList<>(hashSet);


    }
}
