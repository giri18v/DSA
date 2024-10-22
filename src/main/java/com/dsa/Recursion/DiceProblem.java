package com.dsa.Recursion;

import java.util.ArrayList;

public class DiceProblem {


    public static void main(String[] args) {

        System.out.println(getDiceCombinations("",4));
    }


    public static ArrayList<String> getDiceCombinations(String processed,int target){
        ArrayList<String> list = new ArrayList<>();
        if(target == 0){
             list.add(processed);
             return list;
        }

        for(int i=1;i<=6 && i<=target;i++){
           ArrayList<String> finalList = getDiceCombinations(i+processed,target-i);
           list.addAll(finalList);
        }

        return list;
    }

}
