package com.dsa.assignments;

import java.util.ArrayList;

public class RecursionOnArrays {

    public static void main(String[] args) {

        int[] arr = { 1,2,4,5,5,6,7,8};
        System.out.println(sorted(arr,0));

        System.out.println(findTargetIndex(arr,5,0));



    }


    static boolean sorted(int[] arr, int index){

        if(index == arr.length-1){
            return true;
        }

        return arr[index] < arr[index+1] && sorted(arr,index+1);

    }
    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> findTargetIndex(int[] arr, int target, int index){

        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findTargetIndex(arr,target,index+1);

        return list;
    }

}
