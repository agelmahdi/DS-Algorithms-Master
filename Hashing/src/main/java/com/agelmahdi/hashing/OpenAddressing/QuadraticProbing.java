package com.agelmahdi.hashing.OpenAddressing;

import java.util.ArrayList;

public class QuadraticProbing {
    private String[] hashTable;
    private int usedCellNumber;


    //Contructor
    public QuadraticProbing(int size) {
        hashTable = new String[size];
        usedCellNumber = 0;
    }


    //HashFunction to be used on Keys
    private int hashFunction(String key, int cellsnumber) {
        char[] c = key.toCharArray();
        int i, sum;
        for (sum = 0, i = 0; i < c.length; i++)
            sum += c[i];
        return sum % cellsnumber;
    }


    //Returns LoadFactor of HashTable
    private double getLoadFactor() {
        return usedCellNumber * 1.0 / hashTable.length;
    }


    private void rehashKeys(String key) {
        usedCellNumber = 0;
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

    public void insert(String word) {
        double loadFactor = getLoadFactor();
        if (loadFactor >= 0.75) {
            rehashKeys(word);
        } else {
            int index = hashFunction(word, hashTable.length);
            int counter = 0;
            for (int i = index; i < index + hashTable.length; i++) {
                int newIndex = (index + (counter * counter)) % hashTable.length;
                if (hashTable[newIndex] == null) {
                    hashTable[newIndex] = word;
                    break;
                }
                counter++;
            }
        }
        usedCellNumber++;
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
