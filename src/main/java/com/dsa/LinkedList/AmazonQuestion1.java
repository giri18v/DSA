package com.dsa.LinkedList;

import java.util.Arrays;

public class AmazonQuestion1 {

    public static void main(String[] args) {

        int[] trucks ={4,5,7,2};
        int[] items = {1,2,5};

        // Output {3,0,2}

        // Sample input and output
        int trucks1[] = {5,3,8,1};
        int items1[] = {6,10};

        int[] answer = findSmallestWeightOfIndex(trucks,items);
        System.out.println(Arrays.toString(answer));

        // Sample Output
        // {2,-1} for trucks1 and items1

    }


    public static int[] findSmallestWeightOfIndex(int[] trucks, int[] items){
        int[] result = new int[items.length];

        for(int i =0;i<items.length;i++){
            int smallest = -1;
            for(int j=0;j<trucks.length;j++) {
                if(items[i] < trucks[j]) {
                    if(smallest < trucks[j]){
                        smallest = j;
                    }
                }
            }
            result[i] = smallest;
        }
        return result;
    }


}
