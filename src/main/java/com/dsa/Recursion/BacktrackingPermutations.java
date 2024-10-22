package com.dsa.Recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BacktrackingPermutations {


    public static void main(String[] args) {

        int[] nums ={3,2,5,8};
        System.out.println(backtracking(nums,3));

    }


    public static List<HashSet<Integer>> backtracking(int[] nums,int k){


        return returnBacktracking(nums,k,new HashSet<>(),0);
    }


    public static List<HashSet<Integer>> returnBacktracking(int[] nums, int k, HashSet<Integer> set ,int start){
        List<HashSet<Integer>> finalResult = new ArrayList<>();
        List<HashSet<Integer>> partialResult = new ArrayList<>();
        if(set.size() == k){
            List<HashSet<Integer>> result = new ArrayList<>();
            result.add(set);
            return result;
        }

        if(start == nums.length-1){
            return new ArrayList<HashSet<Integer>>();
        }

        for(int i=start;i<nums.length;i++){

            set.add(nums[i]);
            partialResult =  returnBacktracking(nums,k,set,i+1);
        }


       finalResult.addAll(partialResult);
       return finalResult;
    }

}
