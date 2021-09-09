package com.agelmahdi.hashing.OpenAddressing;

import java.util.ArrayList;

public class LinearProbing {

    private String[] hashTable;
    private int usedCell;

    public LinearProbing(int size) {
        hashTable = new String[size];
        usedCell = 0;
    }

    private int hashFunction(String key, int cellsNumber) {
        char[] c = key.toCharArray();
        int sum, i;
        for (sum = 0, i = 0; i < c.length; i++) {
            sum += c[i];
        }
        return sum % cellsNumber;
    }

    // Java documentation
    private double getLoadFactor() {
        return usedCell * 1.0 / hashTable.length;
    }

    private void reHashKeys(String key) {
        usedCell = 0;
        ArrayList<String> data = new ArrayList<>();

        for (String s : hashTable) {
            if (s != null) {
                data.add(s);
            }
        }
        data.add(key);

        hashTable = new String[hashTable.length * 2];

        for (String keyWord : data) {
            insert(keyWord);
        }

    }

    public void insert(String key) {
        double loadFactor = getLoadFactor();
        if (loadFactor >= .75) { // Java documentation
            reHashKeys(key);
        } else {
            int index = hashFunction(key, hashTable.length);

            for (int i = index; i < index + hashTable.length; i++) {
                int newIndex = i % hashTable.length;

                if (hashTable[newIndex] == null) {
                    hashTable[newIndex] = key;
                    break;
                }
            }
        }
        usedCell++;
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
