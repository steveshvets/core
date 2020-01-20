package com.ss.java8.newfeatures.section3;

import java.util.ArrayList;
import java.util.Collections;

/*
default with no comparator --> output insertion order
 */
public class TestEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> l = new ArrayList<>();
        l.add(new Employee(200, "durga"));
        l.add(new Employee(400, "sunny"));
        l.add(new Employee(300, "malika"));
        l.add(new Employee(100, "karina"));

        Collections.sort(l,(e1, e2)->(e1.getEno()>e2.getEno())?-1:(e1.getEno()<e2.getEno())?1:0);

        System.out.println(l);
    }
}
//[Employee{eno=200, ename='durga'}, Employee{eno=400, ename='sunny'}, Employee{eno=300, ename='malika'}, Employee{eno=100, ename='karina'}]