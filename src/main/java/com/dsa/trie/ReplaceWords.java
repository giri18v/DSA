package com.dsa.trie;

import java.util.Arrays;
import java.util.List;

public class ReplaceWords {


    static TrieNode root;

    public ReplaceWords(){
        root = new TrieNode(false);
    }

    public static void insert(String word){
        TrieNode node = root;

        for(int i=0;i<word.length();i++){
            if(node.children[word.charAt(i)-'a'] == null){
                node.children[word.charAt(i)-'a'] = new TrieNode();
            }
            node = node.children[word.charAt(i)-'a'];
        }
        node.isWord = true;
    }

    public static String getPrefix(String sentence){
        TrieNode node = root;
        StringBuilder result = new StringBuilder();
        for(int i=0;i<sentence.length();i++){
            if(node.children[sentence.charAt(i)-'a'] == null){
                break;
            }
            result.append(sentence.charAt(i)-'a');
            if(node.isWord){
                return result.toString();
            }
        }
        return sentence;
    }


    public static String replaceWords(List<String> dictionary, String sentence) {

        for(String str: dictionary){
            insert(str);
        }

        String[] words = sentence.split(" ");
        StringBuilder builder = new StringBuilder();
        for(String str : words){
            builder.append(getPrefix(str));
            builder.append(" ");
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        List<String> dictionary = Arrays.asList("cat","bat","rat");
        replaceWords(dictionary,"the cattle was rattled by the battery");
    }
}
