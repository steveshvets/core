package com.ss.java8.newfeatures.section5;

public class TestP2 implements Left,Right{
    @Override
    public void m1(){
//        System.out.println("my impl testp2");
        Left.super.m1();
    }
    public static void main(String[] args) {
        TestP2 k = new TestP2();
        k.m1();
    }
}
