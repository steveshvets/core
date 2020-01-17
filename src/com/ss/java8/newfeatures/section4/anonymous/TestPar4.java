package com.ss.java8.newfeatures.section4.anonymous;

import com.ss.java8.newfeatures.Inter1M;

public class TestPar4 {

    int x=10;
    public void m2(){
        /*
        local variables (int y only local) that are referenced from lambda are final!!!
         */
            int y = 20; //if refenece from lambda -- always will be final. only local variables of the method
            Inter1M i = ()-> {
                System.out.println("class " + x); //10
                System.out.println("local " + y);//20
                x=88;//changing class variable <-!!! no problem
                System.out.println("class after " + x);//88
//                y=30;
//                System.out.println("outtter after " + y);//problem with compile!!!local varibale referenced from lambda must be final or effectively final
                int x=44;
                System.out.println("var declared in lambda " + x );
                x=77;
                System.out.println("var declared in lambda " + x );
                System.out.println("class " + this.x );

        };
        i.m1();
    }

    public static void main(String[] args) {
        TestPar4 t = new TestPar4();
        t.m2();

    }
}

//output 999
