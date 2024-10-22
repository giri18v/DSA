package com.dsa.Recursion;

import java.util.ArrayList;
import java.util.List;

public class ArraySubSetIterative {

    public static void main(String[] args) {

        int[] nums = {1,2,3};

        List<List<Integer>> result = getSubSet(nums);

        for(List<Integer> list : result){
            System.out.println(list);
        }
    }


    static List<List<Integer>> getSubSet(int[] nums){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num : nums){

            int n = outer.size();

            for(int i=0;i<n;i++){
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }

        }

    return outer;

    }

}
