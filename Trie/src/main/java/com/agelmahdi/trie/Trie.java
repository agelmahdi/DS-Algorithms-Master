package com.agelmahdi.trie;

public class Trie {
    /*
     *  properties
     *  1. it typically used to store or search strings in space and tine efficient way
     *  2. any node in trie can store non repetitive characters
     *  3. every node stores link of the next character of the string
     *  4. every node keeps track of end of string
     * */


    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    /*
     * Insertion
     *  Case 1: Trie is blank
     *  Case 2: new string's prefix is common to another strings prefix
     *  Case 3: new string's prefix is already present as complete string which means reaches to the end of string
     *  Case 4: the string to be inserted is already presented in Trie
     * */

    public void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            TrieNode trieNode = current.getChildren().get(c);

            if (trieNode == null) {
                trieNode = new TrieNode();
                current.getChildren().put(c, trieNode);
            }

            current = trieNode;
        }
        current.setLeaf(true);

    }

    /*
     * Search
     *  Case 1: String does not exist
     *  Case 2: String exists
     *  Case 3: String's prefix of another string, but its does not exist
     * */

    public boolean search(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            TrieNode node = current.getChildren().get(c);
            if (node == null) {
                System.out.println("word does not exists in Trie");
                return false;
            }
            current = node;
        }
        if (current.isLeaf()) {
            System.out.println("word exists in Trie");
            return true;
        } else {
            System.out.println("word does not exists in Trie, but prefix is found");
        }

        return current.isLeaf();
    }
}