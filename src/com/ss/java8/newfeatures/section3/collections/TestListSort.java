package com.ss.java8.newfeatures.section3.collections;

import java.util.ArrayList;
import java.util.Collections;

/*
1. insertion order preserved!
2. Duplicates allowed!
 */
public class TestListSort {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(0);
        l.add(15);
        l.add(20);
        System.out.println("before sorting "+l);
        Collections.sort(l,(i1, i2)->(i1>i2)?-1:(i1<i2)?1:0);
        System.out.println("after sorting "+l);
    }
}

//output [Sunny, Bunny, Chinny, Sunny]
