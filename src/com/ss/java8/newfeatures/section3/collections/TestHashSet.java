package com.ss.java8.newfeatures.section3.collections;

import java.util.HashSet;

/*
1. insertion order not preserved!
2. Duplicates not allowed!
 */
public class TestHashSet {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();
        h.add("Sunny");
        h.add("Bunny");
        h.add("Chinny");
        h.add("Sunny");
        System.out.println(h);
    }
}
//[Chinny, Bunny, Sunny]