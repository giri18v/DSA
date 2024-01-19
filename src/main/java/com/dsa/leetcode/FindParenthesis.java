package com.dsa.leetcode;

import java.util.Stack;

public class FindParenthesis {

    public static void main(String[] args) {

        System.out.println(scoreOfParentheses("(()(()()))"));
    }

    public static int scoreOfParentheses(String s) {

        Stack<Character> stack = new Stack<>();
        for(Character ch : s.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            }else if(ch == ')' && stack.peek() == '('){
                stack.pop();
                stack.push('1');
            }else {
                int result = 0;
                while(!stack.isEmpty() && stack.peek() != '('){
                    result+=stack.pop()-'0';
                }
                stack.pop();
                stack.push((char)(2*result+'0'));
            }

        }
        int finalResult = 0;
        while(!stack.isEmpty()){
            finalResult+= stack.pop()-'0';
        }

        return finalResult;

    }
}
