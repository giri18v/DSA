package com.dsa.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Matrix {

      /*  [1 1 0]    ==> 0 1 1
         [1 0 1].  == > 1 0 1
         [0 0 0].  ===> 0 0 0*/




    public static void main(String[] args) {

        int[][] arr = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        int nums[] = {1,3,4,2};

        flipAndInvertImage(arr);

       System.out.println(selfDividingNumbers(1,22));
        int result[] = sortArrayByParity(nums);
        for(int i : result){
            System.out.println(i);
        }

        System.out.println(judgeCircle("UD"));

    }

    public static  int[][] flipAndInvertImage(int[][] image) {



        int[][] flipped = new int[image.length][image.length];

        for(int row =0;row <image.length;row++){
            int count = 0;
            for(int col =image[row].length-1;col >=0;col--){
             flipped[row][count] = image[row][col];
                count++;
            }

        }
        for(int[] arr : flipped){
            System.out.println(Arrays.toString(arr));
        }


        return flipped;




    }

    public static List<Integer> selfDividingNumbers(int left, int right) {

        left = left-1;
        List<Integer> finalResult = new ArrayList<>();
        while(left <= right){
            left = left+1;
            String value  = String.valueOf(left);
            if(value.length() == 1){
                finalResult.add(left);
            }else if(value.length() > 1) {
                int temp = 0;
                char [] charArray = value.toCharArray();
                for(char ch : charArray){
                    int num = Character.getNumericValue(ch);
                    if(ch =='0') {
                        temp = 0;
                        break;
                    }
                    if(left % num ==0){
                        temp = 1;
                    }else{
                        temp =0;
                        break;
                    }
                }
                if(temp != 0){
                    finalResult.add(left);
                }

            }


        }

        return finalResult;

    }


    public static int[] sortArrayByParity(int[] nums) {

        List<Integer> evenArrayList = new ArrayList<>();
        List<Integer> oddArrayList = new ArrayList<>();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        if(nums.length == 1){
            return nums;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] % 2 == 0){
                evenArrayList.add(nums[i]);
            }else{
                oddArrayList.add(nums[i]);
            }

        }
        evenArrayList.addAll(oddArrayList);

        return evenArrayList.stream().mapToInt(i ->i).toArray();

    }


    public static boolean judgeCircle(String moves) {

        HashMap<Character,Integer> movesMap = new HashMap<>();

        char[] charMoves = moves.toCharArray();
        for(Character mv : charMoves){
            if(movesMap.containsKey(mv)){
                movesMap.put(mv,movesMap.get(mv)+1);
            }else {
                movesMap.put(mv,1);
            }
        }
        int right =0;
        int left = 0;
        int up =0;
        int down = 0;
        if(movesMap.containsKey('R')){
            right = movesMap.get('R');
        }if(movesMap.containsKey('L')){
            left = movesMap.get('L');
        }if(movesMap.containsKey('U')){
            up =movesMap.get('U');
        }if(movesMap.containsKey('D')){
            down =movesMap.get('D');
        }

        if(right - left == 0 && up - down == 0){
            return true;
        }else {
            return false;
        }

    }
}
