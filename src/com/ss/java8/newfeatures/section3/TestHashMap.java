package com.ss.java8.newfeatures.section3;

import java.util.HashMap;

/*
1. insertion order not preserved!
2. Duplicates not allowed!
 */
public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String,String> m = new HashMap<>();
        m.put("A","Apple");
        m.put("Z","Zebra");
        m.put("Durga","Java");
        m.put("B","Boy");
        m.put("T","Tiger");

        System.out.println(m);
    }
}
//[Chinny, Bunny, Sunny]