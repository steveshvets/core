package com.ss.java8.newfeatures.section8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/*
Function 1st input type parameter,  2nd return parameter
 */
public class TestP2 {

    public static void main(String[] args) {

        System.out.println("****************************************");
        List<Student> l = new ArrayList<>();
        populate(l);

        Predicate<Student> p = s-> s.getMarks()>=60;
        Function<Student, String> f = s->{
            if (s.getMarks()>=80){
                return "A";
            } else if (s.getMarks()>=60){
                return "B";
            } else if (s.getMarks()>=50){
                return "C";
            } else if (s.getMarks()>=35){
                return "D";
            } else {
                return "F";
            }
        };
        Consumer<Student> c = s-> {
            System.out.println(s);
            System.out.println(f.apply(s));
            System.out.println();
        };

        for(Student s:l){
            if (p.test(s)){
                c.accept(s);
            }
        }


    }

    public static void populate(List<Student> l) {
        l.add(new Student("steve",51));
        l.add(new Student("rob",87));
        l.add(new Student("mary",34));
        l.add(new Student("vin",98));

    }
}
