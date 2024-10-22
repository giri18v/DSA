package com.dsa.Recursion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MinimumPath {


    public static void main(String[] args) {


        int[][] grid = {
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };

        System.out.println(minPathSum(grid));


    }
    public static int minPathSum(int[][] grid) {

        List<Integer>  list= minPathSumHelper(0, 0, grid,0);
       return Collections.min(list);
    }


    public static List<Integer> minPathSumHelper(int row, int col, int[][] grid,int finalValue) {

        if (row == grid.length - 1 && col == grid[0].length - 1) {
            List<Integer> list = new ArrayList<>();
            finalValue+=grid[row][col];
            list.add(finalValue);
            return list;
        }
        int gridValue=grid[row][col];
        List<Integer> list = new ArrayList<>();
        if (row < grid.length-1) {
            list.addAll(minPathSumHelper(row + 1, col, grid,finalValue+gridValue));
        }
        if (col < grid[0].length-1) {
            list.addAll(minPathSumHelper(row, col + 1, grid,finalValue+gridValue));
        }

        return list;

    }

}
