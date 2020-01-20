package com.ss.java8.newfeatures.section7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/*
Function 1st input type parameter,  2nd return parameter
 */
public class TestP4 {

    public static void main(String[] args) {

        System.out.println("****************************************");
        List<Employee> l = new ArrayList<>();
        populate(l);

        Function<List<Employee>, Double> sum = (list) -> {
            double total = 0;
            for (Employee empl:list){
                total +=empl.getSalary();
            }
            return total;
        };
        System.out.println("total salary " + sum.apply(l));

        System.out.println("****************************************");
        Function<List<Employee>, Double> sumIncrease = (list2)->{
            for (Employee employee: list2){
                if (employee.getSalary()<3500){
                    employee.setSalary(employee.getSalary()+477);
                }
            }
            return sum.apply(list2);
        };
        System.out.println("total salary after increase " +sumIncrease.apply(l));

    }

    public static void populate(List<Employee> l){

        l.add(new Employee("steve",1000));
        l.add(new Employee("mark",2000));
        l.add(new Employee("rob",3000));
        l.add(new Employee("will",4000));
        l.add(new Employee("john",5000));

    }

}
