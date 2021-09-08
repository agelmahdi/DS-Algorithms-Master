package com.agelmahdi.hashing;

import java.util.LinkedList;

public class DirectChaining {
    private LinkedList<String>[] hashTable;

    public DirectChaining(int maxChain) {
        hashTable = new LinkedList[maxChain];
    }


    private int modASCII(String word, int cellsNumber) {
        char[] c = word.toCharArray();
        int sum, i;
        for (sum = 0, i = 0; i < c.length; i++) {
            sum = sum + c[i];
        }
        return sum % cellsNumber;
    }

    public void insertHashTable(String word) {
        int index = modASCII(word, hashTable.length);

        if (hashTable[index] == null) {
            hashTable[index] = new LinkedList<>();
            hashTable[index].add(word);
        } else {
            hashTable[index].addLast(word);

        }
    }

    public void DisplayHashTable() {
        if (hashTable == null) {
            System.out.println("Hash table does not exists");
            return;
        }
        System.out.println("\n-------Hash Table--------\n");

        for (int i = 0; i < hashTable.length; i++) {
            System.out.println("Index: " + i + ", Key: " + hashTable[i]);
        }


    }
}
