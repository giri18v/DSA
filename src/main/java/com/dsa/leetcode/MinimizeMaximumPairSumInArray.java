package com.dsa.leetcode;

class MinimizeMaximumPairSumInArray {


    public static void main(String[] args) {
        int[] arr = {3,5,4,2,4,6};
        System.out.println(minPairSum(arr));
    }
    public static int minPairSum(int[] nums) {

    int max=nums[0];
    for(int num : nums) {
        if(num > max) {
            max = num;
        }
    }

    int[] frequency = new int[max+1];
    for(int num : nums){
        frequency[num]++;
    }
    // [0,0,1,2,0,1]

    int count =0;
    for(int i=0;i<=max;i++){
        while(frequency[i] > 0){
            nums[count] = i;
            count++;
            frequency[i]--;
        }
    }
        int maxCount =0;
        for(int i=0;i<nums.length / 2;i++){
            int pair =nums[i] + nums[nums.length-1-i];
            maxCount = Math.max(maxCount,pair);
        }

        return maxCount;
    }
}