package com.agelmahdi.hashing;

import java.util.LinkedList;

public class DirectChaining {
    private final LinkedList<String>[] hashTable;

    public DirectChaining(int maxChain) {
        hashTable = new LinkedList[maxChain];
    }

    //Hash function calc the sum ASCII codes of characters mod by cellsNumber
    private int modASCIIHashFunction(String word, int cellsNumber) {
        char[] c = word.toCharArray();
        int sum, i;
        for (sum = 0, i = 0; i < c.length; i++) {
            sum = sum + c[i];
        }
        return sum % cellsNumber;
    }

    public void insertHashTable(String key) {
        int index = modASCIIHashFunction(key, hashTable.length);

        if (hashTable[index] == null) {
            hashTable[index] = new LinkedList<>();
            hashTable[index].add(key);
        } else {
            hashTable[index].addLast(key);

        }
    }

    public boolean searchHashTable(String key) {
        int index = modASCIIHashFunction(key, hashTable.length);
        return hashTable[index] != null && hashTable[index].contains(key);
    }

    public boolean deleteKeyHashTable(String key) {
        int index = modASCIIHashFunction(key, hashTable.length);
        boolean isFound = searchHashTable(key);

        if (isFound) {
            hashTable[index].remove(key);
            return true;
        }
        return false;
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
