package com.agelmahdi.hashing;

import com.agelmahdi.hashing.OpenAddressing.DoubleProbing;

public class Main {

    public static void main(String[] args) {
        DoubleProbing directChaining = new DoubleProbing(1);
        directChaining.insert("a");
        directChaining.insert("b");
        directChaining.insert("c");
        directChaining.insert("d");
        directChaining.insert("e");
        directChaining.insert("f");
        directChaining.insert("g");

        directChaining.insert("a");

        directChaining.DisplayHashTable();
    }

}
