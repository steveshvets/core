package com.ss.java8.newfeatures.section8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/*
Function 1st input type parameter,  2nd return parameter
 */
public class TestP1 {

    public static void main(String[] args) {
        System.out.println("****************************************");
        Consumer<String> c = s-> System.out.println(s);
        c.accept("hello");

        System.out.println("****************************************");
        Consumer<Movie> c2 = m-> System.out.println(m);
        List<Movie> l = new ArrayList<>();
        populate(l);
        for (Movie m:l) {
            c2.accept(m);
        }



    }

    public static void populate(List<Movie> l) {
        l.add(new Movie("m1","steve","mary"));
        l.add(new Movie("m2","bob","anna"));
        l.add(new Movie("m2","will","jen"));
    }
}
