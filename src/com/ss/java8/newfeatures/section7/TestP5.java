package com.ss.java8.newfeatures.section7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/*
Function 1st input type parameter,  2nd return parameter
 */
public class TestP5 {

    public static void main(String[] args) {

        System.out.println("****************************************");
        List<Employee> l = new ArrayList<>();
        populate(l);

        System.out.println("before salary increment");
        System.out.println(l);

        Predicate<Employee> lowPaid = (e)->e.getSalary()<3500;
        Function<Employee,Employee> bumpSalary= (e)->{
            e.setSalary(e.getSalary()+477);
            return e;
        };
        List<Employee> l2 = new ArrayList<>();
        for (Employee e:l){
            if (lowPaid.test(e)){
                bumpSalary.apply(e);
                l2.add(e);
            }
        }

        System.out.println("salary incremented");
        System.out.println(l2);


        
    }

    public static void populate(List<Employee> l){

        l.add(new Employee("steve",1000));
        l.add(new Employee("mark",2000));
        l.add(new Employee("rob",3000));
        l.add(new Employee("will",4000));
        l.add(new Employee("john",5000));

    }

}
