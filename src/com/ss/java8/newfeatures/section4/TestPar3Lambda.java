package com.ss.java8.newfeatures.section4;

import com.ss.java8.newfeatures.Inter1M;

public class TestPar3Lambda {

    int x = 888;

    public void m2() {
        int y = 111;
        Inter1M i = () -> {
            int x = 999; //only local variable possible to declare
                            //not possilbe to declare instance variable inside lambdas!!!!!
            System.out.println(x); //999
            System.out.println("this.x " + this.x); //888
        };
        i.m1();
    }

    public static void main(String[] args) {
        TestPar3Lambda t = new TestPar3Lambda();
        t.m2();

    }
}

//output 999
