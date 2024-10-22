package com.dsa.leetcode;

import java.util.HashMap;

public class ContainerCapacity_LC_11 {

    public static void main(String[] args) {

        int[] height ={1,8,6,2,5,4,8,3,7};
        //Output = 49

        System.out.println(containerCapacity(height));


    }


    public static int containerCapacity(int[] height){
        // two pointer approach

        int i =0;
        int j = height.length-1;
        int maxArea = 0;

        while(i < j){
            int area = Math.min(height[i],height[j]) * (j-i);
            maxArea = Math.max(maxArea,area);
            if(height[i] > height[j]){
               j--;
            }else{
                i++;
            }
        }
        return maxArea;
    }



}
