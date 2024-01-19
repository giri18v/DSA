package com.dsa.LinkedList;

import java.util.Arrays;

public class MergeSort {


    public static void main(String[] args) {

        int [] arr ={5,4,3,2,1};

        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] mergeSort(int[] nums){

        if(nums.length == 1){
            return nums;
        }
        int mid = nums.length /2;
        int[] left = mergeSort(Arrays.copyOfRange(nums,0,mid));
        int [] right = mergeSort(Arrays.copyOfRange(nums,mid,nums.length));

        return merge(left,right);

    }

    private static int[] merge(int[] left, int[] right) {

        int i= 0;
        int j =0;
        int k= 0;

        int[] ans = new int[left.length + right.length];

        while(i < left.length && j < right.length){

            if(left[i] < right[j]){
                ans[k] = left[i];
                i++;
            }else if(left[i] > right[j]){
                ans[k] = right[j];
                j++;

            }
            k++;
        }

        while(i < left.length){
            ans[k] = left[i];
            i++;
            k++;
        }

        while( j < right.length){
            ans[k] = right[j];
            j++;
            k++;
        }
        return ans;
    }


}
