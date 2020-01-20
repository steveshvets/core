package com.ss.java8.newfeatures.section7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/*
Function 1st input type parameter,  2nd return parameter
 */
public class TestP3 {

    public static void main(String[] args) {

        System.out.println("****************************************");
        List<Student> l = new ArrayList<>();
        populate(l);

        Function<Student, String> grade = (s) -> {
            int m = s.getMarks();
            if (m>=80){
                return "A";
            } else if (m>=60){
                return "B";
            } else if (m>=50){
                return "C";
            } else if (m>=35){
                return "D";
            } else {
                return "E";
            }
        };

        Predicate<Student> bStudents = student -> student.getMarks() >= 60;

        for (Student s: l){
            System.out.println("student " + s.getName() + " grade " + grade.apply(s));
            if (bStudents.test(s)) {
                System.out.println("student " + s.getName() + " grade " + grade.apply(s));
            }
        }
        System.out.println("*******************************************************");
        for (Student s: l){
            if (bStudents.test(s)) {
                System.out.println("student " + s.getName() + " grade " + grade.apply(s));
            }
        }
    }

    public static void populate(List<Student> l){

        l.add(new Student("steve",90));
        l.add(new Student("mark",65));
        l.add(new Student("rob",45));
        l.add(new Student("will",20));
        l.add(new Student("john",93));

    }

}
