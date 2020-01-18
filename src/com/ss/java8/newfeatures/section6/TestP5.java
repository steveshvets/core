package com.ss.java8.newfeatures.section6;

import java.util.function.Predicate;

/*
return of Predicate is always boolean
 */
public class TestP5 {

    public static void main(String[] args) {
        String[] names = {"Durga", " ", null, "Ravi", " ", "Shiva", null};
        Predicate<String> isNotNullAndNotEmpty = s-> s!=null && s.trim().length()>0;
//        Predicate<String> p1 = n->n.toLowerCase().startsWith("r");
//        Predicate<String> p2 = n->n.charAt(0) == 'r';

//        for (String n:names) {
//            System.out.println("p1 is name " + n + " starts with k: " + p1.test(n));
//            System.out.println("p2 is name " + n + " starts with k: " + p2.test(n));
//        }
//
//        for (String n:names) {
//            if (isNotNullAndNotEmpty.and(p1).test(n)) {
//                System.out.println("p1 name " + n);
//            }
//            if (isNotNullAndNotEmpty.and(p2).test(n)) {
//                System.out.println("p2 name " + n);
//            }
//        }
        for (String n:names) {
            if (isNotNullAndNotEmpty.test(n)) {
                System.out.println("p1 name " + n);
            }
            if (isNotNullAndNotEmpty.test(n)) {
                System.out.println("p2 name " + n);
            }
        }


    }


}
