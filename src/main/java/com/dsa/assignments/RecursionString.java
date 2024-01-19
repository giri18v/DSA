package com.dsa.assignments;

public class RecursionString {

    public static void main(String[] args) {


        skip("","abbcaabrrebwababa");

        System.out.println(skip("abbcaa"));

        System.out.println(skipApple("abbappleasds"));
    }



    static void skip(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            skip(p,up.substring(1));
        }else{
            skip(p+ch,up.substring(1));
        }
    }

    static String skip(String up){

        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return skip(up.substring(1));
        }else{
            return ch+skip(up.substring(1));
        }
    }

    static String skipApple(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            return skipApple(str.substring(5));
        }else {
            return str.charAt(0) + skipApple(str.substring(1));
        }
    }

}
