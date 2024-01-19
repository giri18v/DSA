package com.dsa.LinkedList;

import java.util.Arrays;

public class MergeSortInPlace {

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        containsDuplicate(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void containsDuplicate(int[] nums) {

        //Step 1 : Sort the elements

        //Step2 compare the element with the next element.


        mergeSortInPlace(nums,0,nums.length);
/*
        for(int i =0;i<nums.length;i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;





        HashMap<Integer,Integer> uniqueMap = new HashMap();

        for(Integer element : nums){
            if(uniqueMap.containsKey(element)){
                return true;
            }else {
                uniqueMap.put(element,element);
            }
        }
        return false;

        */


    }


    public static void mergeSortInPlace(int[] nums, int start,int end) {
        if(end -start ==1) {
            return;
        }
        int mid = (start+end) /2;
        mergeSortInPlace(nums,start,mid);
        mergeSortInPlace(nums,mid,end);
        mergeSort(nums,start,mid,end);

    }

    public static void mergeSort(int[] nums,int start,int mid,int end){
        int i =start;
        int j = mid;
        int k=0;
        int[] mix = new int[end-start];

        while( i < mid && j < end){
            if(nums[i] < nums[j]){
                mix[k] = nums[i];
                i++;
            }else {
                mix[k] = nums[j];
                j++;
            }
            k++;
        }
        while(i < mid){
            mix[k] = nums[i];
            i++;
            k++;

        }


        while(j < end){
            mix[k] = nums[j];
            j++;
            k++;
        }

        for(int l =0;l<mix.length;l++){
            nums[start+l] = mix[l];
        }

    }


}
