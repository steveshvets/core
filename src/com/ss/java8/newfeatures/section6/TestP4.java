package com.ss.java8.newfeatures.section6;

import java.util.function.Predicate;

/*
return of Predicate is always boolean
 */
public class TestP4 {

    public static void main(String[] args) {
        String[] names = {"sunny", "kajol", "malika", "katrira", "kareena"};
        Predicate<String> p1 = n->n.toLowerCase().startsWith("k");
        Predicate<String> p2 = n->n.charAt(0) == 'k';

//        for (String n:names) {
//            System.out.println("p1 is name " + n + " starts with k: " + p1.test(n));
//            System.out.println("p2 is name " + n + " starts with k: " + p2.test(n));
//        }

        for (String n:names) {
            if (p1.test(n)) {
                System.out.println("p1 name " + n);
            }
            if (p2.test(n)) {
                System.out.println("p2 name " + n);
            }
        }



    }


}
