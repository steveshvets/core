package com.ss.java8.newfeatures.section7;

import java.util.function.Function;

/*
Function 1st input type parameter,  2nd return parameter
 */
public class TestP7 {

    public static void main(String[] args) {

        System.out.println("****************************************");
        Function<Integer, Integer> f1 = i-> i+i;
        Function<Integer, Integer> f2 = i-> (int) Math.pow(i,3);

        System.out.println(f1.andThen(f2).apply(2));
        System.out.println(f1.compose(f2).apply(2));
    }
}
