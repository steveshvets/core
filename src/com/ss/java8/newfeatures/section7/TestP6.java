package com.ss.java8.newfeatures.section7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/*
Function 1st input type parameter,  2nd return parameter
 */
public class TestP6 {

    public static void main(String[] args) {

        System.out.println("****************************************");
        Function<String, String> f1 =s->s.toUpperCase();
        Function<String, String> f2 = s->s.substring(0,9);

        System.out.println(f1.andThen(f2).apply("steve123456789"));
        System.out.println(f1.compose(f2).apply("steve123456789"));
    }
}
