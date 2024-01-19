package com.dsa.leetcode;

import java.util.Arrays;

public class CustomStack {

    private int[] arr;

    private static final int DEFAULT_SIZE = 5;

    int pointer = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.arr = new int[size];
    }

    public boolean push(int item) throws Exception {
        if(isFull()){
            throw new Exception("Stack is full");
        }
        arr[++pointer] = item;
        return true;
    }

    public boolean isFull(){
      return pointer == arr.length-1;
    }

    public boolean isEmpty(){
        return pointer == -1;
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw  new Exception("Stack is empty");
        }
        int removed = arr[pointer];
        pointer--;
        return removed;
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        return arr[pointer];
    }


    @Override
    public String toString() {
        return "CustomStack{" +
                "arr=" + Arrays.toString(arr) +
                ", pointer=" + pointer +
                '}';
    }
}
