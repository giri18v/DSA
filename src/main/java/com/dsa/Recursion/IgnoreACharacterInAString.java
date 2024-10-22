package com.dsa.Recursion;

public class IgnoreACharacterInAString {


    public static void main(String[] args) {
        String str = "baccad";
        System.out.println(ignoreCharacter(str));

        System.out.println(ignoreCharacter2(str));
    }


    static String ignoreCharacter(String str){

        return ignoreCharacterHelper(str,new StringBuilder());
    }

    static String ignoreCharacter2(String str){

        return ignoreCharacterHelperImproved(str);
    }

    static String ignoreCharacterHelper(String str,StringBuilder answer){

        if(str.isEmpty()){
            return answer.toString();
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            return ignoreCharacterHelper(str.substring(1),answer);
        }else {
            return ignoreCharacterHelper(str.substring(1),answer.append(ch));
        }
    }


    static String ignoreCharacterHelperImproved(String str){

        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            return ignoreCharacterHelperImproved(str.substring(1));
        }else {
            return ch+ignoreCharacterHelperImproved(str.substring(1));
        }
    }
}
