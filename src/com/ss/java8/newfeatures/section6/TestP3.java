package com.ss.java8.newfeatures.section6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/*
return of Predicate is always boolean
 */
public class TestP3 {

    public static void main(String[] args) {

        int[] x = {0, 5, 10, 15, 20, 25, 30};
        Predicate<Integer> p1 = i -> i > 10;
        Predicate<Integer> p2 = i -> i % 2 == 0;
        System.out.println("numbers > 10: ");
        m1(p1, x);
        System.out.println("even numbers: ");
        m1(p2, x);
        System.out.println("numbers not > 10: ");
        m1(p1.negate(), x);
        System.out.println("numbers > 10 and even: ");
        m1(p1.and(p2), x); //two predicates combine into one
        System.out.println("numbers > 10 or even: ");
        m1(p1.or(p2), x); //two predicates combine into one --> predicate joining


    }

    public static void m1(Predicate<Integer> p, int[] x) {
        for (int x1 : x) {
            if (p.test(x1)) {
                System.out.println(x1);
            }
        }
    }
}
