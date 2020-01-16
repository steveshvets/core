package com.ss.java8.newfeatures.section3.collections;

import java.util.ArrayList;

/*
1. insertion order preserved!
2. Duplicates allowed!
 */
public class TestList {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.add("Sunny");
        l.add("Bunny");
        l.add("Chinny");
        l.add("Sunny");
        System.out.println(l);
    }
}

//output [Sunny, Bunny, Chinny, Sunny]
