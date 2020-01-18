package com.ss.java8.newfeatures.section5;

public class TestP3Override implements InterfS{

    /*
    not overriding but creating same method name
    interface static not available to class
     */
    public static void m1(){

    }

    public static void main(String[] args) {
        TestP3Override k = new TestP3Override();
//        k.m1(); //will not compile
//        TestPar3.m1();//will not compile
        InterfS.m1();//ony one way. must use interface name only because static. to define general utility methods
    }
}
