package com.dsa.leetcode;

import java.util.Arrays;
import java.util.Stack;

public class FindDiscountPrices {


    public static void main(String[] args) {


        int[] nums ={8,4,6,2,3};
        int[] nums2 ={8,4,6,2,3};


        System.out.println(Arrays.toString(finalPrices(nums)));
        System.out.println(Arrays.toString(finalDiscountedPrices(nums2)));


    }

    public static int[] finalPrices(int[] prices) {

        Stack<Integer> stack = new Stack<>();

        for (int i = prices.length - 1; i >= 0; i--) {
            boolean lastIndex = false;
            if (stack.isEmpty()) {
                stack.push(prices[i]);
                lastIndex = true;
            }
            if (lastIndex && prices[i] == stack.peek()) {
                continue;
            } else if (prices[i] <= stack.peek()) {
                if (prices[i] == stack.peek()) {
                    prices[i] = 0;
                } else {
                    stack.pop();

                    while (!stack.isEmpty()) {
                        if (prices[i] < stack.peek()) {
                            stack.pop();
                        } else {
                            int temp = prices[i];
                            prices[i] = prices[i] - stack.peek();
                            stack.push(temp);
                            break;
                        }
                    }
                    if (stack.isEmpty()) {
                        stack.push(prices[i]);
                    }
                }

            } else {
                int temp = prices[i];
                prices[i] = prices[i] - stack.peek();
                stack.push(temp);
            }

        }

        return prices;

    }


    public static int[] finalDiscountedPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] <= stack.peek()) {
                int index = stack.pop();
                prices[index] -= prices[i];
            }
            stack.push(prices[i]);
        }

        return prices;
    }
}
