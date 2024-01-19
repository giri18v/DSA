package com.dsa.LinkedList;

public class CeilingOfANumber {

    public static void main(String[] args) {

        int[] nums ={2,4,5,6,8,9,12,46,55,66,87,98};
      //  int[] nums ={98,87,76,65,54,43,34,22,12,10,8,7,5,4,3};
        int target = 88;
        System.out.println(ceiling(nums,target));

    }


    public static int ceiling(int[] arr, int target){
        int start =0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        if(target >arr[end]){
            return -1;
        }

        while(start <= end){
            int mid = start + (end-start) /2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){

                if(target < arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else {

                if(target < arr[mid]){
                    start = mid +1;
                }else {
                    end = mid-1;
                }

            }
        }

        return start;




    }

}
