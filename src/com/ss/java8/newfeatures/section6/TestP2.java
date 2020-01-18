package com.ss.java8.newfeatures.section6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/*
return of Predicate is always boolean
 */
public class TestP2 {

    public static void main(String[] args) {


        Predicate<Integer> p = i->i>10;
        System.out.println(p.test(100));
        System.out.println(p.test(5));
//        System.out.println(p.test("steve"));
//        incompatible types compile error

        Predicate<String> ps = s->s.length()>5;
        System.out.println("l " + ps.test("abcdef"));
        System.out.println("l " + ps.test("abc"));

        Predicate<Collection> pc = c->c.isEmpty();
        List<String> l = new ArrayList<>();
        System.out.println("col " + pc.test(l));
        l.add("abc");
        System.out.println("col " + pc.test(l));

    }
}
