package com.agelmahdi.hashing;

import com.agelmahdi.hashing.OpenAddressing.DoubleProbing;
import com.agelmahdi.hashing.OpenAddressing.QuadraticProbing;

public class Main {

    public static void main(String[] args) {
        QuadraticProbing directChaining = new QuadraticProbing(1);
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
