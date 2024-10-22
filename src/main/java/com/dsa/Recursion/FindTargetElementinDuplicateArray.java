package com.dsa.Recursion;

import java.util.ArrayList;
import java.util.List;

public class FindTargetElementinDuplicateArray {

    public static void main(String[] args) {

        int[] nums ={1,2,4,5,6,4,8,4,9};
        System.out.println(findTargetIndices(nums,4));

        System.out.println(findTargetIndicesHelperForAddingAllAnswers(nums,4,0));

    }

    static List<Integer> findTargetIndices(int[] nums,int target){
        return findTargetIndicesHelper(nums,target,0,new ArrayList<>());
    }


    static List<Integer> findTargetIndicesForRecursive(int[] nums,int target){
        return findTargetIndicesHelperForAddingAllAnswers(nums,target,0);
    }

    static List<Integer> findTargetIndicesHelper(int[] nums, int target, int index, ArrayList<Integer> list){

        if(index == nums.length) {
            return list;
        }

        if(nums[index] == target){
            list.add(index);
        }

        return findTargetIndicesHelper(nums,target,index+1,list);

    }



    static List<Integer> findTargetIndicesHelperForAddingAllAnswers(int[] nums, int target, int index){

        ArrayList<Integer> list = new ArrayList<>();
        if(index == nums.length) {
            return list;
        }

        if(nums[index] == target){
            list.add(index);
        }

        List<Integer> answerFromAllCalls =  findTargetIndicesHelperForAddingAllAnswers(nums,target,index+1);
        list.addAll(answerFromAllCalls);
        return list;

    }

}
