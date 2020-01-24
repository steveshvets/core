package com.ss.java8.codingit.section8;

import java.util.function.Consumer;

public class LambdaVariable2 {
    public static void main(String[] args) {

        int value = 4; //local variable should be final! not allowed to modify

        Consumer<Integer> c1 = (i)->{

//            value++;
//            not allowed.. should be final or effectively final
            System.out.println(value+i);
        };
        c1.accept(4);
    }

}
