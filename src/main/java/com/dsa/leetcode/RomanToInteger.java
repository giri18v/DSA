package com.dsa.leetcode;

import java.util.HashMap;

class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
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
        int result =0;
        int end =ch.length-1;
        for(int i=0;i<=end;i++){
            if(i+1 <= end){
                if((ch[i] == 'I' && ch[i+1] =='X') || (ch[i] == 'I' && ch[i+1] =='V')){
                    result=result-2;
                }else if(i+1 <= end && (ch[i] == 'X' && ch[i+1] =='L') || (ch[i] == 'X' && ch[i+1] =='C')){
                    result =result-20;
                }else if(i+1 <= end && (ch[i] == 'C' && ch[i+1] =='D') || (ch[i] == 'C' && ch[i+1] =='M')){
                    result =result-200;
                }
            }
            result=result+romanMap.get(ch[i]);
        }

        return result;

        //1000+900+90+4
    }
}