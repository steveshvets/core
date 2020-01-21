package com.ss.java8.newfeatures.section13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestP3 {

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

        //min value must use comparator
        System.out.println("*********************************************************************");
        int min = i2.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println(min);

        //max value must use comparator
        System.out.println("*********************************************************************");
        int max = i2.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println(max);

        //forEach
        System.out.println("*********************************************************************");
        i2.stream().forEach(x-> System.out.println(x));

        //forEach method reference replacing lambda expression
        System.out.println("*********************************************************************");
        i2.stream().forEach(System.out::println);

    }

}
