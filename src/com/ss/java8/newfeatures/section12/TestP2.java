package com.ss.java8.newfeatures.section12;

public class TestP2 {

    public static void main(String[] args) {
        Runnable r = ()->{
          for (int i=0;i<10;i++){
              System.out.println("child thread " + Thread.currentThread().getName());
          }
        };

        Thread t = new Thread(r);
        t.start();
        for (int i=0;i<10;i++){
            System.out.println("main thread " + Thread.currentThread().getName());
        }
    }

}
