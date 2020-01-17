package com.ss.java8.newfeatures.section5;

public class TestP1Over implements Interf{

    @Override
    public void m1(){
        System.out.println("my own implementation");
    }

    public static void main(String[] args) {

        TestP1Over k = new TestP1Over();
        k.m1();
    }
}
