package com.agelmahdi.hashing;

public class Main {

    public static void main(String[] args) {
        DirectChaining directChaining = new DirectChaining(10);
        directChaining.insertHashTable("Ahmed");
        directChaining.insertHashTable("gamal");
        directChaining.insertHashTable("mahdi");


        directChaining.DisplayHashTable();
    }

}
