package com.ss.java8.newfeatures.section12;

public class TestP4 {

    public static void main(String[] args) {
        //lambda expression
        System.out.println("***************************************");
        Interf2 i =()-> {
            Sample s = new Sample();
            return s;
        };
        Sample s1 = i.get();

        //constructor reference
        System.out.println("***************************************");
        Interf2 i2 = Sample::new;
        i.get();



    }
}
