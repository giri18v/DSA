package com.dsa.assignments;

import java.util.Arrays;

public class MaximumCoins1561 {

    public static void main(String[] args) {

        int[] nums ={9,8,7,6,5,1,2,3,4};
        System.out.println(maximumCoins(nums));

    }

    static int maximumCoins(int[] piles) {

        Arrays.sort(piles);
        int j=0;
        int len = piles.length;
        int coins =0;

        for(int i=len-2;i > 0;i-=2){

            coins+=piles[i];

            if(++j == len/3){
                return coins;
            }
        }
        return coins;
    }


}
