package com.agelmahdi.hashing;

import com.agelmahdi.hashing.OpenAddressing.LinearProbing;

public class Main {

    public static void main(String[] args) {
        LinearProbing directChaining = new LinearProbing(1);
        directChaining.insert("a");
        directChaining.insert("b");
        directChaining.insert("c");
        directChaining.insert("d");
        directChaining.insert("e");
        directChaining.insert("f");
        directChaining.insert("g");

        directChaining.delete("a");
        directChaining.insert("a");

        directChaining.DisplayHashTable();
    }

}
