package com.agelmahdi.hashing;

public class Main {

    public static void main(String[] args) {
        DirectChaining directChaining = new DirectChaining(1);
        directChaining.insertHashTable("Ahmed");
        directChaining.insertHashTable("gamal");
        directChaining.insertHashTable("mahdi");

        directChaining.deleteKeyHashTable("gamal");
        directChaining.DisplayHashTable();
    }

}
