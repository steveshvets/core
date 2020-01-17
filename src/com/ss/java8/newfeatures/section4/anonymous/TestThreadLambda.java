package com.ss.java8.newfeatures.section4.anonymous;

import com.ss.java8.newfeatures.section3.collections.Employee;

import java.util.ArrayList;
import java.util.Collections;

/*
default with no comparator --> output insertion order
 */
public class TestThreadLambda {
    public static void main(String[] args) {

        Runnable r = ()->{
            for (int i=0; i<10; i++){
                System.out.println("child thread " + Thread.currentThread().getName());
            }
        };

        Thread t = new Thread(r);
        r.run();

        System.out.println("main thread " + Thread.currentThread().getName());
    }
}
//[Employee{eno=200, ename='durga'}, Employee{eno=400, ename='sunny'}, Employee{eno=300, ename='malika'}, Employee{eno=100, ename='karina'}]