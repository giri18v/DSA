package com.dsa.Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationsInAString {


    public static void main(String[] args) {
        System.out.println(findPerm("","abc"));
    }

    static List<String> findPerm(String processed,String unProcessed){
        List<String> finalList = new ArrayList<>();
        if(unProcessed.isEmpty()){
            finalList.add(processed);
            return finalList;
        }

        char ch = unProcessed.charAt(0);
        List<String> list;
        for(int i=0;i<=processed.length();i++){
            String first = processed.substring(0,i);
            String second = processed.substring(i);
             list = findPerm(first+ch+second,unProcessed.substring(1));
            finalList.addAll(list);
        }
       return finalList;

    }


}
