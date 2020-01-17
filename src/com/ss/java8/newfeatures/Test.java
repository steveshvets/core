package com.ss.java8.newfeatures;

public class Test {
    public static void main(String[] args) {
        Inter1M i = ()-> System.out.println("hello");
        i.m1();

        Inter1M i2 = ()-> System.out.println("hello2");
        i2.m1();
    }
}
