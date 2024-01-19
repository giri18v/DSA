package com.dsa.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FindTheChangedIndex {

    public static void main(String[] args) {
        int[] arr = {75,99,19,93,87,68,12,18,48,83,24,50,16,53,36,16,80,68,46,13,53,100,50,49,77,52,34,42,38,98,73,11,13,61,72,8,11,67,98,24,23,71,47,6,5,7,97,86,25,82,11,15,26,97,69,6,30,77,98,44,32,39,71,47,64,78,6,61,72,75};
        System.out.println(targetIndices(arr,98));

    }
    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> finalList = new ArrayList<>();
        Arrays.sort(nums);
        int first = binarySearch(nums, target, 0, nums.length - 1, true);
        int last = binarySearch(nums, target, 0, nums.length - 1, false);

        if(first == last) {
            finalList.add(first);
        }else {
            for(int i=first;i<=last;i++){
                finalList.add(i);
            }
        }
        return finalList;
    }

    static int binarySearch(int[] nums,int target, int start,int end,boolean firstOccurence) {
       int ans =-1;
       while(start<=end){
           int mid = start+(end-start)/2;
           if(nums[mid] > target){
               end = mid-1;
           }else if(nums[mid] < target){
              start = mid+1;
           }else {
               ans = mid;
               if(firstOccurence) {
                   end = mid-1;
               }else {
                   start =mid+1;
               }
           }

       }
        return ans;

    }


    public static int[] countSort(int[] arr){

    int max = arr[0];
    for(int num : arr){
        if(num > max){
            max = num;
        }
    }

    int[] frequency = new int[max+1];
    for(int num : arr){
        frequency[num]++;
    }
        int count = 0;
    for(int i=0;i<=max;i++){
        while(frequency[i] > 0){
        arr[count] = i;
        count++;
        frequency[i]--;
        }
    }

    return arr;

    }



}