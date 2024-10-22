package com.dsa.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {


    public static void main(String[] args) {

        System.out.println(getRow(3));
    }
        public static List<Integer> getRow(int rowIndex) {

            List<List<Integer>> result = new ArrayList<>();
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            result.add(firstRow);

            if(rowIndex == 0){
                return firstRow;
            }

            for(int i=1;i<=rowIndex;i++){

                List<Integer> previousRow = result.get(i-1);

                List<Integer> row = new ArrayList<>();
                row.add(1);
                for(int j=0;j<i-1;j++){
                    row.add(previousRow.get(j)+previousRow.get(j+1));
                }
                row.add(1);
                result.add(row);
            }

            return result.get(rowIndex);

        }

}
