package com.dsa.Recursion;

public class ReverseString {


    public static void main(String[] args) {

        char[] ch ={'h','e','l','l','o'};
        reverseString(ch);

    }



    public static void reverseString(char[] ch) {

        reverseStringHelper(ch.length-1,ch);
        System.out.println(ch);

    }


    public static void reverseStringHelper(int index,char[] ch) {

        if(index < ch.length/2){
            return;
        }

        char temp = ch[index];
        ch[index] =ch[ch.length-index-1];
        ch[ch.length-index-1] = temp;

        reverseStringHelper(index-1,ch);

    }

}
