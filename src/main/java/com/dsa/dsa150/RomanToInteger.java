package com.dsa.dsa150;

import java.util.HashMap;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));

    }

    public static int romanToInt(String s) {

        HashMap<Character,Integer> romanMap = new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('M',1000);
        romanMap.put('D',500);

        char[] ch = s.toCharArray();
        int result =romanMap.get(ch[ch.length-1]);
        for(int i=ch.length-2;i>=0;i--){
            if(romanMap.get(ch[i]) > romanMap.get(ch[i+1])){
                result+=romanMap.get(ch[i]);
            }else{
                result+=romanMap.get(ch[i]);
            }
        }
        return result;
    }
}
