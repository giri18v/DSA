package com.dsa.leetcode;

public class Deck {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,4,3,2,1};
        hasGroupsSizeX(nums);
    }

    public  static boolean hasGroupsSizeX(int[] deck) {
        if(deck.length ==1){
            return false;
        }
        countSort(deck);

        for(int i=1;i<deck.length;i++){
            if(deck[i-1] != deck[i]){
                return false;
            }

        }

        return true;

    }

    public static int[] countSort(int[] nums){

        int max = nums[0];
        for(int num : nums){

            if(num > max){
                max = num;
            }
        }

        int[] frequency = new int[max+1];

        for(int num : nums){
            frequency[num]++;
        }
        int count =0;
        for(int i=0;i<=max;i++){

            while(frequency[i] > 0){
                nums[count] =i;
                count++;
                frequency[i]--;
            }

        }
        return nums;

    }

}
