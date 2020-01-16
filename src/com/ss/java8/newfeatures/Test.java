package com.ss.java8.newfeatures;

public class Test {
    public static void main(String[] args) {
        Inter2 i = ()-> System.out.println("hello");
        i.m1();

        Inter2 i2 = ()-> System.out.println("hello2");
        i2.m1();
    }
}
