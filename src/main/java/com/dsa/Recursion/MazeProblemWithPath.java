package com.dsa.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class MazeProblemWithPath {

    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}


        };
        int[][] path = new int[maze.length][maze[0].length];

        mazeProblem("",maze,0,0,path,1);

    }

    static void mazeProblem(String processed, boolean[][] maze, int row, int col,int[][] path,int step){

        if(row == maze.length-1 && col == maze[0].length-1){
            path[row][col] =step;
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            for(int [] p: path){
                System.out.println(Arrays.toString(p));
            }

            System.out.println(processed);
            return ;
        }
        if(!maze[row][col]){
            return ;
        }
        // Setting the path as already visited.
        maze[row][col] = false;
        path[row][col] =step;
        // Down
        if(row < maze.length-1){
            mazeProblem(processed+'D',maze,row+1,col,path,step+1);
        }
        //Right
        if(col <maze[0].length-1){
            mazeProblem(processed+'R',maze,row,col+1,path,step+1);
        }
        //UP
        if(row > 0){
            mazeProblem(processed+'U',maze,row-1,col,path,step+1);
        }

        //Left
        if(col > 0){
            mazeProblem(processed+'L',maze,row,col-1,path,step+1);
        }
        maze[row][col] = true;
        path[row][col] = 0;

    }


}
