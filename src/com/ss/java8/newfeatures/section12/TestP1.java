package com.ss.java8.newfeatures.section12;

public class TestP1 {

    public static void m2() {
        System.out.println("method reference");
    }
    public void m3() {
        System.out.println("instance method reference");
    }

    public static void main(String[] args) {
        Intref i = TestP1::m2; //method reference! m1 method refers to m2.
        // arguments must be the same!!!
//        return types can be different
//        method names could be different
//        modified could be different
        i.m1();

        System.out.println("******************************************************");
        TestP1 t = new TestP1();
        Intref i2 = t::m3;
        i2.m1();

    }
}
