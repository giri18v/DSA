package com.dsa.LinkedList;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class PeakIndex {

    public static void main(String[] args) {
        int nums[] = {1,2};
        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {

        int start = 0;
        int end =nums.length-1;
        if(nums.length ==1){
            return 0;
        }
        while(start <=end){
            int mid =start +(end-start)/2;
            if(mid !=end && nums[mid] > nums[mid+1]){
                return mid;
            }else if(nums[mid] > nums[mid-1]){
                return mid;
            }else {
                start =mid+1;
            }
        }
        return -1;

    }
}
