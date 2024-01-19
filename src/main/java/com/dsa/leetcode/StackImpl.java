package com.dsa.leetcode;

import java.util.Stack;

public class StackImpl {

    public static void main(String[] args) throws Exception {


        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(4);
        stack.push(13);
        stack.push(98);
        stack.push(65);

        System.out.println(stack.peek());

        System.out.println(stack.pop());


        System.out.println(stack);

        CustomStack customStack = new CustomStack(5);
        customStack.push(1);
        customStack.push(5);
        customStack.push(15);
        customStack.push(32);
        customStack.push(65);

        System.out.println(customStack);
        System.out.println(customStack.peek());
        System.out.println(customStack.pop());
        System.out.println(customStack.peek());

    }


}
