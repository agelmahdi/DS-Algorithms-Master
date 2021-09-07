package com.agelmahdi.trie;

public class Trie {
    /*
     *  properties
     *  1. it typically used to store or search strings in space and time-efficient way
     *  2. any node in trie can store non-repetitive characters
     *  3. every node stores link of the next character of the string
     *  4. every node keeps track of the end of the string
     * */

    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    /*
     * Insertion
     *  Case 1: Trie is blank
     *  Case 2: new string's prefix is common to the prefix of another string
     *  Case 3: new string's prefix is already present as a complete string which means reaches to the end of the string
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
    /*
     * Deletion
     *  Case 1: Some other prefix of string is same as the string for deletion
     *  Case 2: the string is a prefix of another string
     *  Case 3: other string is a prefix of the string for deletion
     *  Case 4: not any nodes depends on the string
     * */

    private boolean delete(TrieNode root, String word, int index) {
        char c = word.charAt(index);
        TrieNode current = root.getChildren().get(c);
        boolean canDeleted;

        if (current.getChildren().size() > 1) { // case 1: serving as a prefix for another one
            delete(current, word, index + 1);
            return false;
        }

        if (index == word.length() - 1) {
            if (current.getChildren().size() >= 1) { // case 2: at the last character of the word, but this word is prefix of another word
                current.setLeaf(false);
                return false;
            } else {
                root.getChildren().remove(c);
                return true;
            }
        }

        if (current.isLeaf()) {
            delete(current, word, index + 1); // case 3: some other word is a prefix of the word
            return false;
        }

        canDeleted = delete(current, word, index + 1); // case 4: not any nodes depends on the string

        if (canDeleted) {
            current.getChildren().remove(c);
            return true;
        }

        return false;
    }

    public void delete(String word) {
        if (search(word)) {
            delete(root, word, 0);
        }

    }
}