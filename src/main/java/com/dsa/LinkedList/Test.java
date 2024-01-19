package com.dsa.LinkedList;

import java.util.HashMap;

public class Test {

    public static void main(String[] args) {
        System.out.println(getLastDigit("3","10"));

        StringBuilder sb = new StringBuilder();
        HashMap<Character,Integer> charMapCount = new HashMap<>();

    }


    static int getLastDigit(String a, String b) {
        // code here
        int element1 = Integer.parseInt(a);
        int element2 = Integer.parseInt(b);
        int result = 1;
        for(int i =1;i<=element2;i++){
            result= result*element1;
        }
        System.out.println( "Result " +result);
        String str = Integer.toString(result);
        String s = str.substring(str.length()-1,str.length());
        int finalResult = Integer.parseInt(s);
        return finalResult;




    }


}
