package com.ss.opensystems;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) throws Exception {

        Consumer<String>c = ConsumerDemo::showConsumer;
        c.accept("jack");
        c.accept("jill");
        c.accept("r'");

    }

    public static void  showConsumer(String name){
        System.out.println(name);
    }
}
