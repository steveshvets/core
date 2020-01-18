package com.ss.java8.newfeatures.section5;

import com.ss.java8.newfeatures.section4.anonymous.TestPar3;

public class TestP3 implements InterfS{

    public static void main(String[] args) {
        TestP3 k = new TestP3();
//        k.m1(); //will not compile
//        TestPar3.m1();//will not compile
        InterfS.m1();//ony one way. must use interface name only because static. to define general utility methods
    }
}
