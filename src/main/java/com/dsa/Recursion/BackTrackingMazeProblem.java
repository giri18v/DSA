package com.dsa.Recursion;

import java.util.ArrayList;

public class BackTrackingMazeProblem {

    public static void main(String[] args) {


        System.out.println(mazeProblem(3,3));
        mazePath("",3,3);

        System.out.println(mazePathReturn("",3,3));
        System.out.println(mazePathReturnDiagonal("",3,3));
    }


    static int mazeProblem(int row,int col){

        if(row == 1 || col == 1){

            return 1;
        }

        int right = mazeProblem(row,col-1);
        int down = mazeProblem(row-1,col);

        return right+down;

    }

    static void mazePath(String processed,int row , int col){

        if(row == 1 && col == 1){
            System.out.println(processed);
            return ;
        }

        if(row > 1){

            mazePath(processed+'D',row-1,col);
        }
        if(col > 1){
            mazePath(processed+'R',row,col-1);
        }

    }

    static ArrayList<String> mazePathReturn(String processed, int row , int col){
        ArrayList<String> finalList = new ArrayList<>();
        if(row == 1 && col == 1){
            finalList.add(processed);
            return finalList;
        }

        if(row > 1){

            ArrayList<String> left = mazePathReturn(processed+'D',row-1,col);
            finalList.addAll(left);
        }
        if(col > 1){
            ArrayList<String> right = mazePathReturn(processed+'R',row,col-1);
            finalList.addAll(right);
        }
        return finalList;
    }


    static ArrayList<String> mazePathReturnDiagonal(String processed, int row , int col){

        if(row == 1 && col == 1){
            ArrayList<String> finalList = new ArrayList<>();
            finalList.add(processed);
            return finalList;
        }
        ArrayList<String> finalList = new ArrayList<>();
        if(row > 1 && col >1){
            ArrayList<String> diagonal = mazePathReturnDiagonal(processed+'D',row-1,col-1);
            finalList.addAll(diagonal);

        }

        if(row > 1){

            ArrayList<String> left = mazePathReturnDiagonal(processed+'V',row-1,col);
            finalList.addAll(left);
        }
        if(col > 1){
            ArrayList<String> right = mazePathReturnDiagonal(processed+'H',row,col-1);
            finalList.addAll(right);
        }
        return finalList;
    }


}
