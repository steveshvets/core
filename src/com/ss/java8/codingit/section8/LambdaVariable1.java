package com.ss.java8.codingit.section8;

import java.util.function.Consumer;

public class LambdaVariable1 {
    public static void main(String[] args) {
        int i = 0;

        Consumer<Integer> c1 = (i1)->{


            System.out.println(i);
        };
    }

}
