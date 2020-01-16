package com.ss.java8.newfeatures.section3.collections;

import java.util.TreeMap;
import java.util.TreeSet;

/*
1. always sorted by key default natural sorting order
 */
public class TestTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> k = new TreeMap<>((i1, i2)->(i1>i2)?-1:(i1<i2)?1:0);
        k.put(100,"durga");
        k.put(600,"sunny");
        k.put(300,"bunny");
        k.put(200,"chinny");
        k.put(700,"vinny");
        k.put(400,"pinny");


        System.out.println(k);
//        Collections.sort(l,(i1, i2)->(i1>i2)?-1:(i1<i2)?1:0);
//        System.out.println("after sorting "+l);
    }
}


