package com.dsa.trie;

public class TrieNode {

    boolean isWord;
    TrieNode[] children = new TrieNode[26];

    public TrieNode(boolean isWord) {
        this.isWord = isWord;
    }

    public TrieNode() {
    }
}
