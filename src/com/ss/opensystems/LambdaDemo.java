package com.ss.opensystems;

/*
Opensysteminterview question
Answer will not compile line22
 */
public class LambdaDemo {

    public static void main(String[] args) {
        printMyName("Jack");
    }

    public static void printMyName(String name) {

        name = name + "Nelson";

        Runnable r = ()->{
            try{
                Thread.sleep(100);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
//            System.out.println("Welcome" + name);
        };
        new Thread(r).start();
        System.out.println("y " + name);

    }
}
