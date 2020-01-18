package com.ss.java8.newfeatures.section6;

import java.util.function.Predicate;

/*
return of Predicate is always boolean
 */
public class TestPIsEqual {

    public static void main(String[] args) {

        Predicate<String> p = Predicate.isEqual("steve");
        System.out.println(p.test("steve"));
        System.out.println(p.test("marina"));


    }


}
