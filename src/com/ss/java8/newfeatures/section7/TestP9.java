package com.ss.java8.newfeatures.section7;

import java.util.function.Function;

/*
Function 1st input type parameter,  2nd return parameter
 */
public class TestP9 {

    public static void main(String[] args) {
        System.out.println("****************************************");
        Function<String, String> f1 = Function.identity();

        System.out.println(f1.apply("steve"));


    }
}
