package com.ss.java8.newfeatures.section13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        System.out.println("*********************************************************************");
        List<Integer> l = new ArrayList<>();
        l.add(0);
        l.add(10);
        l.add(20);
        l.add(5);
        l.add(15);
        l.add(25);
        System.out.println(l);

        //even numbers
        System.out.println("*********************************************************************");
        List<Integer> l2 = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(l2);

        //new collection each element double of original
        System.out.println("*********************************************************************");
        List<Integer> l3 = l.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println(l3);
        System.out.println("l " + l);

        //even numbers option2
        System.out.println("*********************************************************************");
        Predicate<Integer> p1 = (i)-> i%2==0;
        List<Integer> l4 = l.stream().filter(p1).collect(Collectors.toList());
        System.out.println("l4 " + l4);
        System.out.println("l " + l);

        //even numbers option2
        System.out.println("*********************************************************************");

    }

}
