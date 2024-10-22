package com.dsa.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DynamicProgramming {

    public static void main(String[] args) {


        System.out.println(diffWaysToCompute("2*3-4*5"));
    }

    public static List<Integer> diffWaysToCompute(String expression) {

        return diffWaysToComputeHelper(expression,new HashMap<String,List<Integer>>());

    }

    public static List<Integer> diffWaysToComputeHelper(String expression, HashMap<String,List<Integer>> memo) {

        char[] ch = expression.toCharArray();
        List<Integer> finalResult = new ArrayList<>();
        List<Integer> leftArr = new ArrayList<>();
        List<Integer> rightArr = new ArrayList<>();
        if(memo.containsKey(expression)){
            return memo.get(expression);
        }
        for(int i=0;i<ch.length;i++){
            if(ch[i] =='+' || ch[i] =='-' || ch[i] =='*'){
                leftArr =diffWaysToComputeHelper(expression.substring(0,i),memo);
                rightArr =diffWaysToComputeHelper(expression.substring(i+1),memo);
            }
            for(int num1 : leftArr){
                for(int num2 : rightArr){
                    if(ch[i] == '+'){
                        finalResult.add(num1+num2);
                    }else if(ch[i] == '-'){
                        finalResult.add(num1-num2);
                    }else if(ch[i] == '*'){
                        finalResult.add(num1*num2);
                    }
                }
            }

        }
        if(finalResult.size() == 0){
            finalResult.add(Integer.valueOf(expression));
        }
        memo.put(expression,finalResult);
        return finalResult;

    }
}
