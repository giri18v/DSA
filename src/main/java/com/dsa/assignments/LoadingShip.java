package com.dsa.assignments;

public class LoadingShip {

    public static void main(String[] args) {

    int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(shipWithinDays(nums,5));
    }
    public static int shipWithinDays(int[] nums, int days) {

        int max = 0;
        int sum =0;
        for(int num:nums){
            sum+=num;
            if(num > max){
                max = num;
            }
        }

        while(max <=sum){

            int mid = max +(sum-max)/2;

            int totalDays = noOfDays(mid,nums);

            if(totalDays <= days){
                sum = mid-1;


            }else {
                max = mid+1;
            }

        }

        return max;


    }

    static int noOfDays(int capacity,int[] nums){

        int day =1;
        int load =0;

        for(int i=0;i<nums.length;i++){

            if(nums[i]+load > capacity){
                day = day+1;
                load = nums[i];
            }else {

                load+=nums[i];
            }

        }

        return day;
    }



}
