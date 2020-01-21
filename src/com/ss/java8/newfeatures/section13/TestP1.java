package com.ss.java8.newfeatures.section13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestP1 {

    public static void main(String[] args) {

        System.out.println("*********************************************************************");
        List<String > l = new ArrayList<>();
        l.add("Steve");
        l.add("John");
        l.add("Mike");
        l.add("Will");
        l.add("Rob");
        l.add("Robertino12345");
        System.out.println(l);

        //strings objects length gt 9
        System.out.println("*********************************************************************");
        List<String> l1 = l.stream().filter(s->s.length()>=9).collect(Collectors.toList());
        System.out.println(l1);

        //strings objects all uppercase
        //1. open Stream for list l.stream()
        //2. For Stream configure map method (for every element create equivalent string in uppercase
        //3. Collect those elements to list
        System.out.println("*********************************************************************");
        List<String> l2 = l.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(l2);

        //count how many string gt 9
        //count present on Stream interface
        System.out.println("*********************************************************************");
        int i1 = (int) l.stream().filter(s->s.length()>=9).count();
        System.out.println(i1);

        //sorted
        //
        System.out.println("*********************************************************************");
        List<Integer> i2 = new ArrayList<>();
        i2.add(0);
        i2.add(10);
        i2.add(20);
        i2.add(5);
        i2.add(15);
        i2.add(25);
        System.out.println(i2);
        //asc
        List<Integer> l3 = i2.stream().sorted().collect(Collectors.toList());
        System.out.println(l3);
        //desc ...not good way!!!!
        List<Integer> l4 = i2.stream().sorted((i,x)->{
            if (i>x) {
                return -1;
            } else if (i<x) {
                return 1;
            } else {
                return 0;
            }
        }).collect(Collectors.toList());
        System.out.println(l4);
        //with anonymous class!!!! not good way
        List<Integer> l5 = i2.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer x) {
                if (i>x) {
                    return -1;
                } else if (i<x) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }).collect(Collectors.toList());
        System.out.println(l5);
        //lambda sorting reverse compare !!!! correct way
        List<Integer> l6 = i2.stream().sorted((i,x)->-i.compareTo(x)).collect(Collectors.toList());
        System.out.println(l6);

    }

}
