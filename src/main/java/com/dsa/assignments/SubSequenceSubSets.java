package com.dsa.assignments;

import java.util.ArrayList;

public class SubSequenceSubSets {

    public static void main(String[] args) {


        subSequence("","abc");

        System.out.println(subSequenceReturn("","abc"));

    }



    static void subSequence(String processed , String unProcessed){

        if(unProcessed.isEmpty()){

            System.out.println(processed);
            return;
        }

        char ch = unProcessed.charAt(0);

        subSequence(processed+ch,unProcessed.substring(1));
        subSequence(processed,unProcessed.substring(1));


    }


    static ArrayList<String> subSequenceReturn(String processed,String unProcessed){
        if(unProcessed.isEmpty()){

            ArrayList<String> list = new ArrayList<>();
                list.add(processed);
                return list;
        }

        char ch = unProcessed.charAt(0);

        ArrayList<String> leftList = subSequenceReturn(processed+ch,unProcessed.substring(1));
        ArrayList<String> rightList= subSequenceReturn(processed ,unProcessed.substring(1));

        leftList.addAll(rightList);

        return leftList;
    }



}
