package com.dsa.assignments;

public class ReverseWords {

    public static void main(String[] args) {
        System.out.println(reverseWords2("a good   example"));
    }


    public static String reverseWords(String s) {
        String word ="";
        String result ="";
        char[] str = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(str[i] == ' '){
                if(i>0 && str[i-1] !=' '){
                    result = (result.length() > 0) ? word+" "+result :word;
                }
                word ="";
            }else {
                word=word+str[i];
            }

        }
        if(word.length() >0){
            result =(result.length() > 0) ? word+" "+result :word;
        }

        return result;
    }

    public static String reverseWords2(String s) {
        String result ="";
        String[] strs = s.split(" ");
        for(String str :strs){
            str = str.trim();
            result =result.length() >0 ? str+" "+result :str;

        }

        return result;
    }

}
