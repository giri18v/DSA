package com.dsa.Recursion;

import java.util.ArrayList;

public class MazeProblemBackTracking {

    public static void main(String[] args) {

        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}


        };
        System.out.println(mazeProblem("",maze,0,0));

    }

    static ArrayList<String> mazeProblem(String processed,boolean[][] maze,int row,int col){

        if(row == maze.length-1 && col == maze[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        if(!maze[row][col]){
            return new ArrayList<>();
        }
        // Setting the path as already visited.
        maze[row][col] = false;

        // Down
        ArrayList<String> list = new ArrayList<>();
        if(row < maze.length-1){
            list.addAll(mazeProblem(processed+'D',maze,row+1,col));
        }
        //Right
        if(col <maze[0].length-1){
            list.addAll(mazeProblem(processed+'R',maze,row,col+1));
        }
        //UP
        if(row > 0){
            list.addAll(mazeProblem(processed+'U',maze,row-1,col));
        }

        //Left
        if(col > 0){
            list.addAll(mazeProblem(processed+'L',maze,row,col-1));
        }
        maze[row][col] = true;
        return list;

    }


}
