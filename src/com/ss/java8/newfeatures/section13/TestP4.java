package com.ss.java8.newfeatures.section13;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
copy elements to Array
 */

public class TestP4 {

    public static void main(String[] args) {


        System.out.println("*********************************************************************");
        List<Integer> i2 = new ArrayList<>();
        i2.add(0);
        i2.add(10);
        i2.add(20);
        i2.add(5);
        i2.add(15);
        i2.add(25);
        System.out.println(i2);

        //toArray example -- require to provide Integer[] array
        System.out.println("*********************************************************************");
        Integer[] i3 = i2.stream().toArray(Integer[]::new);
        for (Integer i : i3) {
            System.out.println(i);
        }

        //StreamOf group of values
        System.out.println("*********************************************************************");
        Stream<Integer> i4 = Stream.of(9,99,999,9999,99999);
        i4.forEach(System.out::println);

        //StreamOf for array
        System.out.println("*********************************************************************");
        Double[]d = {10.0,10.1,10.2,10.3,10.4};
        Stream<Double> d1 = Stream.of(d);
        d1.forEach(x-> System.out.println(x));
    }

}
