package com.ss.java8.codingit;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class StreamMinMaxExample {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(6,7,8,9,10);
//        List<Integer> l = new ArrayList<>();
//        Optional<Integer> i1 = l.stream().reduce((x, y)->x>y?x:y);
//        Optional<Integer> i1 = l.stream().peek(i-> System.out.println(i)).max((x, y)->{
//            System.out.println("x " + x + " y " + y + " compare " + x.compareTo(y));
//            return x.compareTo(y);
//        });
        Optional<Integer> i1 = l.stream().peek(i-> System.out.println(i)).max((x, y)->x<y?-1:(x>y)?1:0);
        System.out.println("max " + (i1.isPresent()?i1.get():"no value"));

        Integer i2 = l.stream().reduce(0,(x,y)->x>y?y:x);
        System.out.println("min " + i2);

        Boolean t1 = l.stream().anyMatch(i->i==6);
        System.out.println("match " + t1);

        Student s1 = new Student("steve", 3.8, 2, "male");
        Student s2 = new Student("jen", 4.0, 3, "female");
        Student s3 = new Student("bob", 4.0, 3, "male");
        List<Student> l2 = new ArrayList<>();
        l2.add(s1); l2.add(s2);l2.add(s3);

        Map<Double,List<Student>> m = l2.stream().collect(Collectors.groupingBy(s->s.getGpa()));
        System.out.println(m);

        Map<String,List<Student>> m2 = l2.stream().collect(Collectors.groupingBy(s->s.getGpa()==4.0?"EXCELLENT":"GOOD"));
        System.out.println(m2);


        List<Double> gpas = l2.stream().map(s->s.getGpa()).sorted().collect(Collectors.toList());
        System.out.println(gpas);

    }
}
