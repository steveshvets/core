package com.ss.java8.codingit.section14;

import java.util.stream.IntStream;
/*
not to use parallel stream!!!
if you have mutable variable do not use parallel streams at all !!!!!
 */
public class SumClient {

    public static void main(String[] args) {

        Sum sum = new Sum();

        IntStream.rangeClosed(1,1000)
                //1,2,3..1000
                .parallel() // concurrently accessing mutable variable --> wrong results
                .forEach(sum::performSum); //500500
        //448461
        //427396
        //424733
        System.out.println(sum.getTotal());
    }
}
