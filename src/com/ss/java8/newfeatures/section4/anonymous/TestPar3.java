package com.ss.java8.newfeatures.section4.anonymous;

import com.ss.java8.newfeatures.Inter1M;
import com.ss.java8.newfeatures.InterAdd;

public class TestPar3 {

    int x=888;
    public void m2(){
        Inter1M i = new Inter1M() {
            int x = 999; //instance variable
            @Override
            public void m1() {
                System.out.println(this.x);
                System.out.println("outtter" + TestPar3.this.x);
            }
        };
        i.m1();
    }

    public static void main(String[] args) {
        TestPar3 t = new TestPar3();
        t.m2();

    }
}

//output 999
