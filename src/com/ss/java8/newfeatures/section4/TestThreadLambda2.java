package com.ss.java8.newfeatures.section4;

/*
default with no comparator --> output insertion order
 */
public class TestThreadLambda2 {
    public static void main(String[] args) {



        Thread t = new Thread(()->{
            for (int i=0; i<10; i++){
                System.out.println("child2 thread " + Thread.currentThread().getName());
            }
        });
        t.start();

        System.out.println("main2 thread " + Thread.currentThread().getName());
    }
}
//[Employee{eno=200, ename='durga'}, Employee{eno=400, ename='sunny'}, Employee{eno=300, ename='malika'}, Employee{eno=100, ename='karina'}]