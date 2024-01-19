package com.dsa.leetcode;

import java.util.Stack;

public class ReversePolishNotation {

    public static void main(String[] args) {
        String[] stringArr = {"4","13","5","/","+"};
        System.out.println(evalRPN(stringArr));

    }

    public static int evalRPN(String[] tokens) {

        Stack<String> stack = new Stack<>();

        for (String str : tokens) {
            if (str.equals("+")) {
                if (!stack.isEmpty()) {
                    int result = Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop());
                    stack.push(String.valueOf(result));
                }
            }else if (str.equals("-")) {
                if (!stack.isEmpty()) {
                    int firstElement = Integer.parseInt(stack.pop());
                    int result = Integer.parseInt(stack.pop()) - firstElement;
                    stack.push(String.valueOf(result));
                }
            }else if (str.equals("*")) {
                if (!stack.isEmpty()) {
                    int firstElement = Integer.parseInt(stack.pop());
                    int result = Integer.parseInt(stack.pop()) * firstElement;
                    stack.push(String.valueOf(result));
                }
            }else if (str.equals("/")) {
                if (!stack.isEmpty()) {
                    int firstElement = Integer.parseInt(stack.pop());
                    int result = Integer.parseInt(stack.pop()) / firstElement;
                    stack.push(String.valueOf(result));
                }
            } else {
                stack.push(str);
            }

        }

        int finalResult = Integer.parseInt(stack.peek());

        return finalResult;
    }
}
