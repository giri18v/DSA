package com.dsa.LinkedList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class MorseCode {


    public static void main(String[] args) {
        String[] words = {"gin","zen","gig","msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }
    public static int uniqueMorseRepresentations(String[] words) {

        String[] morseWords = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> morseSet = new HashSet<>();
        for(String str : words){
            StringBuilder sb = new StringBuilder();
            for(char ch : str.toCharArray()){
                int index = ch-'a';
                sb.append(morseWords[index]);
            }
            morseSet.add(sb.toString());
        }

        return morseSet.size();

    //45ms 43.21 mb

    }

}
