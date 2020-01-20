package com.ss.java8.newfeatures.section8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/*
Function 1st input type parameter,  2nd return parameter
 */
public class TestP4 {

    public static void main(String[] args) {

        System.out.println("****************************************");
        List<Movie2> l = new ArrayList<>();
        populate(l);

        Consumer<Movie2> c1 = m-> System.out.println(m.getName() + " is ready to release");
        Consumer<Movie2> c2 = m-> System.out.println(m.getName() + " is " + m.getResult());
        Consumer<Movie2> c3 = m-> System.out.println(m.getName() + " storing in DB");

        Consumer<Movie2> chainedC = c1.andThen(c2).andThen(c3);

        for (Movie2 m :l){
            chainedC.accept(m);
            System.out.println();
        }



    }

    public static void populate(List<Movie2> l) {
        l.add(new Movie2("m1","hit"));
        l.add(new Movie2("m2","pop"));
        l.add(new Movie2("m3","pop"));
        l.add(new Movie2("m4","hit"));

    }
}
