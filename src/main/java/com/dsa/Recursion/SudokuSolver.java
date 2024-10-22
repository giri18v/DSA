package com.dsa.Recursion;

public class SudokuSolver {

    public static void main(String[] args) {

        char[][] board= {
                {'9', '5', '7', '.', '1', '3', '.', '8', '4'},
                {'4', '8', '3', '.', '5', '7', '1', '.', '6'},
                {'.', '1', '2', '.', '4', '9', '5', '3', '7'},
                {'1', '7', '.', '3', '.', '4', '9', '.', '2'},
                {'5', '.', '4', '9', '7', '.', '3', '6', '.'},
                {'3', '.', '9', '5', '.', '8', '7', '.', '1'},
                {'8', '4', '5', '7', '9', '.', '6', '1', '3'},
                {'.', '9', '1', '.', '3', '6', '.', '7', '5'},
                {'7', '.', '6', '1', '8', '5', '4', '.', '9'}
        };

        solve(board);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }




    }


    static boolean solve(char[][] board){

        for (int row = 0; row < board.length; row++) {

            for (int col = 0; col < board[0].length; col++) {
                if(board[row][col] == '.'){

                    for (char ch = '1'; ch <= '9' ; ch++) {

                        if(isValid(board,row,col,ch)){
                            board[row][col] = ch;

                            if(solve(board)){
                                return true;
                            }else{
                                board[row][col] ='.';
                            }
                        }


                    }
                    return false;
                }


            }

        }

        return true;



    }

    private static boolean isValid(char[][] board, int row, int col, char ch) {

        for (int i = 0; i < 9; i++) {
            //checking row
            if(board[i][col] == ch){
                return false;
            }
            //checking column
            if(board[row][i] == ch){
                return false;
            }
            //checking the 3x3 Matrix
            if(board[3 * (row/3) + i/3][3 *(col/3)+i%3] == ch){
                return false;
            }

        }
        return true;
    }


}
