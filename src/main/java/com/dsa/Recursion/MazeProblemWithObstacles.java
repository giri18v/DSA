package com.dsa.Recursion;

import java.util.ArrayList;

public class MazeProblemWithObstacles {


    public static void main(String[] args) {

        boolean[][] maze = {
                {true,true,true},
                {true,false,true},
                {true,true,true}

        };
        System.out.println(pathWithoutObstacles("",maze,0,0));
    }

    static ArrayList<String> pathWithoutObstacles(String processed,boolean[][] maze,int row,int col){
        if(row == maze.length-1 && col == maze[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        if(!maze[row][col]){
            return new ArrayList<>();
        }

        ArrayList<String> list = new ArrayList<>();
        if( row < maze.length-1){
                list.addAll(pathWithoutObstacles(processed+'D',maze,row+1,col));

        }
        if(col < maze[0].length-1){
            list.addAll(pathWithoutObstacles(processed+'R',maze,row,col+1));
        }

        return list;
    }


}
