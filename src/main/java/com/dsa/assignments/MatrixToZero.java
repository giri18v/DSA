package com.dsa.assignments;

import java.util.Arrays;

public class MatrixToZero {

    public static void main(String[] args) {
    int[][] matrix = {
            {1,1,1},
            {1,0,1},
            {1,1,1}

    };
    setZeroes(matrix);
    for(int[] arr : matrix){
        System.out.println(Arrays.toString(arr));
    }


    }


    public static void setZeroes(int[][] matrix) {

        int col0 =-1;

        for(int i=0;i<matrix.length;i++){

            if(matrix[i][0] == 0){
                col0 = 0;
            }

            for(int j=1;j<matrix[0].length;j++){

                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[j][0] = 0;
                }

            }

        }

        for(int i=matrix.length-1;i>=0;i--){

            for (int j=matrix[0].length-1;j>=0;j--){

                if(matrix[i][0] == 0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
            if(col0 == 0){
                matrix[i][0]=0;
            }
        }

    }



}
