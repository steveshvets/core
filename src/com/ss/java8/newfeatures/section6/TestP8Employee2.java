package com.ss.java8.newfeatures.section6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*
return of Predicate is always boolean
 */
public class TestP8Employee2 {

    public static void main(String[] args) {
        List<Employee> l = new ArrayList<>();
        populate(l);
        System.out.println(l);

        Predicate<Employee> manager = e -> e.getDesignation().equals("manager");
        Predicate<Employee> bangalore = e -> e.getCity().equals("Bangalore");
        Predicate<Employee> bonus = e -> e.getSalary() < 20000;
        Predicate<Employee> isCeo = Predicate.isEqual(new Employee("steve", "ceo", 30000, "Bangalore"));

        System.out.println("managers");
        display(manager,l);
        System.out.println("Bangalore");
        display(bangalore,l);
        System.out.println("bonus");
        display(bonus,l);

        System.out.println("pinkSlip");
        display(manager.and(bangalore),l);//returns combined predicate -> predicate join

        System.out.println("manager or < 20k");
        display(manager.or(bonus),l);//returns combined predicate -> predicate join

        System.out.println("not managers");
        display(manager.negate(),l);

        System.out.println("ceo"); //require to override equals method in employee otherwise would not work
        Employee e1= new Employee("steve", "ceo", 30000, "Bangalore");
        Employee e2 = new Employee("vova", "manager", 30000, "Bangalore");
        System.out.println(isCeo.test(e1));
        System.out.println(isCeo.test(e2));

    }

    public static void display(Predicate<Employee> p, List<Employee> e) {
        for (Employee empl : e) {
            if (p.test(empl)) {
                System.out.println(empl);
            }
        }
        System.out.println("**************************************************************");
    }

    public static void populate(List<Employee> l) {
        l.add(new Employee("steve", "ceo", 30000, "Bangalore"));
        l.add(new Employee("marina", "super", 10000, "Brooklyn"));
        l.add(new Employee("jen", "clerk", 15000, "Bangalore"));
        l.add(new Employee("sima", "manager", 18000, "Bangalore"));
        l.add(new Employee("bill", "stockboy", 22000, "Bangalore"));
    }


}
