package com.ss.java8.newfeatures;

public class ThreadDemo1 {
    public static void main(String[] args) {

        Runnable r = () -> {
            System.out.println("runnable thread name: " + Thread.currentThread().getName());
        };

        Thread t = new Thread(r);
        t.start();
        System.out.println("main thread name " + Thread.currentThread().getName());


    }

}
