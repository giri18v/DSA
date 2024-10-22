package com.dsa.leetcode;

import java.util.Arrays;

public class TwoSumII_LC_167 {

    public static void main(String[] args) {
       int[] numbers = {2,7,11,15};
       int target = 9;

       int[] nums = sumNumbers(numbers,target);

        System.out.println(Arrays.toString(nums));
        //Output: [1,2]
        //Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
    }

    public static int[] sumNumbers(int[] nums,int target){

        int i =0;
        int j=nums.length-1;
        int[] result = new int[2];

        while(i <= j){
            if(nums[i]+nums[j] == target){
                result[0] = i+1;
                result[1] = j+1;
                break;
            }else if(target < nums[i]+nums[j]){
                j--;
            }else{
                i++;
            }
        }
        return result;
    }


}
