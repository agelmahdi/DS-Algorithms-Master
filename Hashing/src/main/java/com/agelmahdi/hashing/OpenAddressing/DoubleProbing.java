package com.agelmahdi.hashing.OpenAddressing;

import java.util.ArrayList;

public class DoubleProbing {
    private String[] hashTable;
    private int usedCell;


    public DoubleProbing(int size) {
        hashTable = new String[size];
        usedCell = 0;
    }


    // HashFunction to be used on Keys
    private int hashFunction(String x, int M) {
        char[] ch;
        ch = x.toCharArray();
        int i, sum;
        for (sum = 0, i = 0; i < x.length(); i++) {
            sum = sum + ch[i];
        }
        return sum % M;
    }

    //Creates a new HashTable and does ReHashing
    private void rehashKeys(String key) {
        usedCell = 0;
        ArrayList<String> data = new ArrayList<String>();
        for (String s : hashTable) {
            if (s != null)
                data.add(s);
        }
        data.add(key);
        hashTable = new String[hashTable.length * 2];
        for (String s : data) {
            insert(s);
        }
    }

    // Display the hash table
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


    private int addAllDigitsTogether(int sum) {
        int value = 0;
        while (sum > 0) {
            value = sum % 10;
            sum = sum / 10;
        }
        return value;
    }

    private int secondHashFunction(String x, int M) {
        char[] ch= x.toCharArray();
        int i, sum;
        for (sum = 0, i = 0; i < ch.length; i++) {
            sum += ch[i];
        }
        while (sum > hashTable.length) {
            sum = addAllDigitsTogether(sum);
        }

        return sum % M;

    }

    public double getLoadFactor() {
        return usedCell * 1.0 / hashTable.length;
    }

    public void insert(String value) {
        double loadFactor = getLoadFactor();
        if (loadFactor >= 0.75) {
            rehashKeys(value);
        } else {
            int first = hashFunction(value, hashTable.length);
            int second = secondHashFunction(value, hashTable.length);
            for (int i = 0; i < hashTable.length; i++) {
                int newIndex = (first + i * second) % hashTable.length;
                if (hashTable[newIndex] == null) {
                    hashTable[newIndex] = value;
                    break;
                }
            }
        }
        usedCell++;

    }

}
