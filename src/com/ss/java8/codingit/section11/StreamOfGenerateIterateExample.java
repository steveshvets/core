package com.ss.java8.codingit.section11;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("a","b","c");
        stream.forEach(s-> System.out.println(s));

        Stream.iterate(1, x->x*2)
                .limit(10)
                .forEach(s-> System.out.println(s));

        System.out.println("*******************************************************");
        Supplier<Integer> supplier = ()-> (new Random()).nextInt();
        Stream.generate(supplier)
                .limit(10)
                .forEach(System.out::println);
    }
}
