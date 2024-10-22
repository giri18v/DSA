package com.dsa.heap;

public class HeapInsert {


    public static int[] insert(int[] arr,int lastIndex){
        int temp ;
        int i = lastIndex;
        temp = arr[i];
        while(temp > arr[i/2]){
            arr[i] = arr[(i/2)];
            i=(i/2);
        }
        arr[i] = temp;
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        int[] result = insert(arr,3);
        System.out.println(result);



    }



}
