package com.dsa.Recursion;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class StringSubSet {


    public static void main(String[] args) {
        String str = "abc";
        System.out.println(findSubset(str));

        System.out.println(findSubsetASCII(str));

    }


    static List<String> findSubset(String str){

            return findSubSetHelper("",str);

    }


    static List<String> findSubsetASCII(String str){

        return findSubSetASCIIHelper("",str);

    }


    static List<String> findSubSetHelper(String processed,String unProcessed){
        List<String> result = new ArrayList<>();
        if(unProcessed.isEmpty()){
            if(!processed.isBlank()){
                result.add(processed);
                return result;
            }else {
                return new ArrayList<>();
            }

        }

        List<String> taken = findSubSetHelper(processed+unProcessed.charAt(0),unProcessed.substring(1));
        List<String> ignored = findSubSetHelper(processed,unProcessed.substring(1));

        taken.addAll(ignored);
        return taken;
    }

    static List<String> findSubSetASCIIHelper(String processed,String unProcessed){
        List<String> result = new ArrayList<>();
        if(unProcessed.isEmpty()){
            if(!processed.isBlank()){
                result.add(processed);
                return result;
            }else {
                return new ArrayList<>();
            }

        }
        char ch = unProcessed.charAt(0);
        List<String> taken = findSubSetASCIIHelper(processed+unProcessed.charAt(0),unProcessed.substring(1));
        List<String> ignored = findSubSetASCIIHelper(processed,unProcessed.substring(1));
        List<String> ascii = findSubSetASCIIHelper(processed+(ch+(ch+0)),unProcessed.substring(1));

        taken.addAll(ignored);
        taken.addAll(ascii);
        return taken;
    }
}
