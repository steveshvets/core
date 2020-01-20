package com.ss.java8.newfeatures.section7;

import java.util.function.Function;
import java.util.function.Predicate;

/*
Function 1st input type parameter,  2nd return parameter
 */
public class TestP8 {

    public static void main(String[] args) {
        System.out.println("****************************************");
        Function<String, String> f1 = s -> s.substring(0, 5);
        Function<String, String> f2 = s-> s.toLowerCase();

        String pwd = "java";

        if (f1.andThen(f2).apply("Steve1234567").equals("steve")&&pwd.equals("java")){
            System.out.println("valid user");
        } else {
            System.out.println("invalid user");
        }
    }
}
