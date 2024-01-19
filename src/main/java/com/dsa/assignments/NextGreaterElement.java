package com.dsa.assignments;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        int[] nums = {1,5,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums)));


    }

    public static int[] nextGreaterElement(int[] nums){

        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length-1; i >=0 ; i--) {
            if(stack.isEmpty()){
                stack.push(nums[i]);
            }

            if(nums[i] == stack.peek()){
                nums[i] = -1;
            }else if(nums[i] > stack.peek()){
                stack.pop();
                stack.push(nums[i]);
                if(nums[i] == stack.peek()){
                    nums[i] =-1;
                }
            }else{
                int temp = nums[i];
                nums[i]=stack.peek();
                stack.push(temp);
            }


        }

        return nums;


    }
}
