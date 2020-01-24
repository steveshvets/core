package com.ss.java8.codingit.section9;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStreams {

    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        names.add("adam");
        names.add("jim");
        names.add("jenny");

        for (String name: names){
            System.out.println(name);
        }
        for (String name: names){
            System.out.println(name);
        }

        names.remove(0);
        System.out.println(names);

//        names.stream();
//stream does not allow to add remove modify elements once it is created
        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);
        //IllegalStateException: stream has already been operated upon or closed
        //traverse stream only once
//        nameStream.forEach(System.out::println);

    }
}
