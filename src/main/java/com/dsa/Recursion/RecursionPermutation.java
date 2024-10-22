package com.dsa.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursionPermutation {

    public static void main(String[] args) {

        int[] nums ={3,2,5,8};
       // System.out.println(permute(nums,new ArrayList<>(),new boolean[nums.length]));

        permute(nums,new ArrayList<>(),new boolean[nums.length]);
    }


    public static void permute(int[] nums, ArrayList<Integer> partialList, boolean[] isUsed){
        //Base condition
        if(partialList.size() == nums.length){
           System.out.println(Arrays.toString(partialList.toArray()));
           ArrayList<List<Integer>> partialPerm = new ArrayList<>();
            partialPerm.add(partialList);
            return ;
        }

        for(int i=0;i<nums.length;i++){

            if(!isUsed[i]){
                isUsed[i] = true;
                partialList.add(nums[i]);
               // ArrayList<List<Integer>> permutations = permute(nums,partialList,isUsed);
                isUsed[i] = false;

            }
        }

      //  return partialList;

    }

}
