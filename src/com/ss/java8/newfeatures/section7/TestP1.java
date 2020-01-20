package com.ss.java8.newfeatures.section7;

import java.util.function.Function;

/*
Function 1st input type parameter,  2nd return parameter
 */
public class TestP1 {

    public static void main(String[] args) {

        System.out.println("****************************************");
        Function<String, Integer> fl = (s) -> s.length();
        System.out.println(fl.apply("steve"));

        System.out.println("****************************************");
        Function<Integer, Integer> fs = (i) -> i*i;
        System.out.println(fs.apply(3));

        System.out.println("****************************************");
        Function<String, String> fsp = (s) -> s.replaceAll("\\s","");
        System.out.println(fsp.apply("I love you"));

        System.out.println("****************************************");
        Function<String, Long> fspc = (s) -> s.chars().filter(c -> c == ' ').count();
        System.out.println(fspc.apply(" I love you "));

        System.out.println("****************************************");
        Function<String, Integer> fspc2 = (s) -> s.length() - s.replaceAll("\\s","").length();
        System.out.println(fspc2.apply(" I love you "));

    }


}
