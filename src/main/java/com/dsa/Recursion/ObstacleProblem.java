package com.dsa.Recursion;

public class ObstacleProblem {


    public static void main(String[] args) {

        int[][] nums= {
            {0,  0,  0},
            {0, -1, 0},
            {0,  0,  0}
        };

        System.out.println(noOfWays(0,0,nums));

        int[][] memo = {
                {-1,-1,-1,-1},
                {-1,-1,-1,-1},
                {-1,-1,-1,-1},
                {-1,-1,-1,-1}

        };
        System.out.println(noOfWaysMemo(0,0,nums,memo));
        System.out.println(noOfWaysTabulation(nums.length,nums[0].length,nums));


    }


    public static int noOfWays(int row,int col,int[][] obstacles){

        if(row == obstacles.length || col ==obstacles[0].length || obstacles[row][col] == -1){
            return 0;
        }

        if(row ==obstacles.length-1 && col == obstacles[0].length-1){
            return 1;
        }

        return noOfWays(row+1,col,obstacles)+noOfWays(row,col+1,obstacles);

    }

    public static int noOfWaysMemo(int row,int col,int[][] obstacles,int[][] memo){
        int result =0;
        if(row == obstacles.length || col ==obstacles[0].length || obstacles[row][col] == -1){
            memo[row][col] =1;
            return 0;
        }

        if(row ==obstacles.length-1 && col == obstacles[0].length-1){
            return 1;
        }
        if(memo[row][col] == 1){
            return 0;
        }

        result =noOfWaysMemo(row+1,col,obstacles,memo)+noOfWaysMemo(row,col+1,obstacles,memo);
        memo[row][col] =result;
        return result;
    }

    public static int noOfWaysTabulation(int row,int col,int[][] obstacles) {
        int[][] dp = new int[obstacles.length][obstacles[0].length];
        dp[row - 1][col - 1] = 1;

        for (int i = row - 1; i >= 0; i--) {
            for (int j = col - 1; j >= 0; j--) {
                if (obstacles[i][j] == -1) {
                    dp[i][j] = 0;
                }
                if(i==row-1 && j==col-1){
                    continue;
                }
                if (i == row - 1) {
                    dp[i][j] = dp[i][j + 1];
                } else if (j == col - 1) {
                    dp[i][j] = dp[i + 1][j];
                } else {
                    dp[i][j] = dp[i][j + 1] + dp[i+1][j];
                }

            }

        }
        return dp[0][0];
    }
}
