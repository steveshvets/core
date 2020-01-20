package com.ss.java8.newfeatures.section10;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

/*

 */
public class TestP1 {

    public static void main(String[] args) throws InterruptedException {

        //sum of 2 integers even or not
        System.out.println("****************************************");
        BiPredicate<Integer, Integer> bp = (i,x)->(i+x)%2==0;
        System.out.println(bp.test(2,3));
        System.out.println(bp.test(2,6));

        //product of two integers example
        BiFunction<Integer, Integer, Integer> bf1 = (x,y)-> x*y;
        System.out.println(bf1.apply(2,3));
        System.out.println(bf1.apply(3,5));

//        generate new Student
        System.out.println("****************************************");
        BiFunction<String, Integer, Student> bf2 = (n,r)->new Student(n,r);
        List<Student> l = new ArrayList<>();
        l.add(bf2.apply("steve", 100));
        l.add(bf2.apply("marina", 300));
        l.add(bf2.apply("jen", 400));
        for(Student s:l){
            System.out.println(s);
        }

        //        calculate monthly salary with Employee & Timesheet objects as input by using BiFunction
        System.out.println("****************************************");
        Employee e1 = new Employee(101, "steve", 1500);
        Employee e2 = new Employee(202, "marina", 900);
        TimeSheet t1 = new TimeSheet(101,5);
        TimeSheet t2 = new TimeSheet(202,4);
        BiFunction<Employee, TimeSheet, Double> bf3 = (e,t)->e.getDailyWage()*t.getDays();
        System.out.println(bf3.apply(e1, t1));
        System.out.println(bf3.apply(e2, t2));
        //        consumer two string values return concat
        System.out.println("****************************************");
        BiConsumer<String, String> bc1 = (s,y)-> System.out.println(s.concat(y));
        bc1.accept("hello ", "world");

        //        increment employee salary by using BiFunction & BiConsumer
        System.out.println("****************************************");
        List<Employee> l2 = new ArrayList<>();
        BiFunction<String, Double, Employee> bf4 = (n,s)-> new Employee(n,s);
        l2.add(bf4.apply("steve", 1500.0));
        l2.add(bf4.apply("bob", 3200.0));
        l2.add(bf4.apply("will", 4900.0));
        l2.add(bf4.apply("jen", 700.0));
        BiConsumer<Employee, Double> bc3 = (e, b)-> e.setSalary(e.getSalary()+b);
        for (Employee e: l2){
            bc3.accept(e,500.0);
            System.out.println(e);
        }

    }

}
