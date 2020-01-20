package com.ss.java8.newfeatures.section12;
/*
method reference
argument must be the same
forget about return type, method name, modifier
 */
public class TestP3 {

    public void m1(){
        for (int i=0;i<10;i++){
            System.out.println("child thread " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Runnable r = new TestP3()::m1;
        Thread t = new Thread(r);
        t.start();
        for (int i=0;i<10;i++){
            System.out.println("main thread " + Thread.currentThread().getName());
        }
    }

}
