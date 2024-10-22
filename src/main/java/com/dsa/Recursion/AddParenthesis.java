package com.dsa.Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AddParenthesis {

    public static void main(String[] args) {

        String input = "2*3-4*5";
        System.out.println(diffWaysToCompute(input));

    }

    public static List<Integer> diffWaysToCompute(String expression) {

     //   return diffWaysToComputeHelperRecursion(expression);
        return diffWaysToComputeHelperMemoization(expression,new HashMap<>());
    }

    static List<Integer> diffWaysToComputeHelperRecursion(String expression) {

        if(expression.length() ==1){
           List<Integer> result = new ArrayList<>();
           result.add(Integer.parseInt(expression));
           return result;
        }
        List<Integer> leftResult = new ArrayList<>();
        List<Integer> rightResult = new ArrayList<>();
        List<Integer> finalResult = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {

            if(expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '*'){
                leftResult = diffWaysToCompute(expression.substring(0,i));
                rightResult = diffWaysToComputeHelperRecursion(expression.substring(i+1));

                for(int left : leftResult) {

                    for(int right :rightResult) {
                        if(expression.charAt(i) == '+'){
                            finalResult.add(left+right);
                        } else if(expression.charAt(i) == '-'){
                            finalResult.add(left-right);
                        }if(expression.charAt(i) == '*'){
                            finalResult.add(left*right);
                        }
                    }
                }
            }
        }

        return finalResult;

    }

    static List<Integer> diffWaysToComputeHelperMemoization(String expression, HashMap<String,Integer> memo) {

        if(memo.containsKey(expression)){
            List<Integer>  result = new ArrayList<>();
            result.add(memo.get(expression));
        }
        List<Integer> leftResult = new ArrayList<>();
        List<Integer> rightResult = new ArrayList<>();
        List<Integer> finalResult = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {

            if(expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '*'){
                leftResult = diffWaysToCompute(expression.substring(0,i));
                rightResult = diffWaysToComputeHelperRecursion(expression.substring(i+1));

                for(int left : leftResult) {

                    for(int right :rightResult) {
                        if(expression.charAt(i) == '+'){
                            finalResult.add(left+right);
                        } else if(expression.charAt(i) == '-'){
                            finalResult.add(left-right);
                        }if(expression.charAt(i) == '*'){
                            finalResult.add(left*right);
                        }
                    }
                }

            }

        }
        if(finalResult.size() == 0){
            finalResult.add(Integer.parseInt(expression));
        }
        memo.put(expression,finalResult.get(0));
        return finalResult;

    }

}
