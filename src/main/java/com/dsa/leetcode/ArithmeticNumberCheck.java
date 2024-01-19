package com.dsa.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

class ArithmeticNumberCheck {

    public static void main(String[] args) {
        int[] nums ={4,6,5,9,3,7};
        int[] l ={0,0,2};
        int[] r ={2,3,5};
        System.out.println(checkArithmeticSubarrays(nums,l,r));


    }
    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int start =0;
        int end = l.length-1;
        List<Boolean> answerList = new ArrayList<>();
        while(start <=end){
            boolean isArithmetic = checkArithmetic(nums,l[start],r[start]);
            answerList.add(isArithmetic);
            start++;
        }

            return answerList;
        
    }

    public static boolean checkArithmetic(int[] nums, int start, int end){

        int[] res = new int[end-start+1];
        int count = 0;
        for(int i=start;i<=end;i++){
            res[count] = nums[i];
            count++;
        }
        Arrays.sort(res);
        int diff = res[1] - res[0];
        for(int i=2;i<res.length;i++){
        if(res[i]- res[i-1] != diff){
            return false;
        }
        }
        return true;

    }


}