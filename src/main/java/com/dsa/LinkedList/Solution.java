package com.dsa.LinkedList;

import java.util.Arrays;

public class Solution {


    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] result = nextGreaterElement(nums1,nums2);
        for (int i : result){
            System.out.println(i);
        }

        char[] ch = {'a','c','d','f'};
        char[] chars = Arrays.copyOf(ch,ch.length);

        for (char c : chars){
            System.out.println(c);
        }


        String s = "Hello my name is";


        String[] strArr = s.split(" ");

        for(String str : strArr){
            System.out.println(str);
        }

    }




    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] result = new int[nums1.length];

        for(int i=0;i<nums1.length;i++){

            for(int j=0;j<nums2.length;j++){
                int lastIndex = nums2[nums2.length-1];
                if(nums1[i] == nums2[j]){
                    if(lastIndex == nums2[j]){
                        result[i] = -1;
                    }else {
                        for(int k=j+1;k<nums2.length;k++){
                            if(nums1[i] < nums2[k]){
                                result[i] = nums2[k];
                                break;
                            }
                        }
                        if(result[i] == 0){
                            result[i] = -1;
                        }

                    }
                }

            }

        }
        return result;
    }

}
