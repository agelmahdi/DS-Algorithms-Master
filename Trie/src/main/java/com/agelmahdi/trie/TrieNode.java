package com.agelmahdi.trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    private Map<Character, TrieNode> children;

    private char c;

    private boolean isLeaf;

    public TrieNode(){
        children = new HashMap<>();
        isLeaf = false;
    }
    public char getC() {
        return c;
    }

    public Map<Character, TrieNode> getChildren() {
        return children;
    }

    public void setChildren(Map<Character, TrieNode> children) {
        this.children = children;
    }

    public boolean isLeaf() {
        return isLeaf;
    }

    public void setLeaf(boolean leaf) {
        isLeaf = leaf;
    }

    public void setC(char c) {
        this.c = c;
    }
}
