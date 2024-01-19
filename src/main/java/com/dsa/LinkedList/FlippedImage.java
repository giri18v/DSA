package com.dsa.LinkedList;

import java.util.Arrays;

public class FlippedImage {

    static int recursion = 0;
    public static void main(String[] args) {

        int[][] arr = {
                {1,1,0,0},
                {1,0,0,1},
                {0,1,1,1},
                {1,0,1,0}
        };

        int[][] finalResult  = flipAndInvertImage(arr);
        for(int[] arr2: finalResult){
            System.out.println(Arrays.toString(arr2));
        }

    }




        public static int[][] flipAndInvertImage(int[][] image) {

            int[][] flipped = new int[image.length][image.length];
            int[][] finalResult = new int[image.length][image.length];

            for(int row =0;row <image.length;row++){
                int column =0;
                for(int col =image[row].length-1;col >=0;col--){
                    if(recursion ==0){
                        flipped[row][column] = image[row][col];
                        column++;
                    }else  if(image[row][col] ==0){
                        finalResult[row][col] = 1;
                    }else {
                        finalResult[row][col] = 0;
                    }

                }
            }
            if(recursion ==0){
                recursion++;
               finalResult =  flipAndInvertImage(flipped);
            }
            return finalResult;
        }


}
