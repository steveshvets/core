package com.ss.java8.newfeatures.section9;

import java.util.Date;
import java.util.Random;
import java.util.function.Supplier;

import static java.lang.Thread.sleep;

/*
Chaining Supplier not applicable!!!
no andThen method at all!!!!
 */
public class TestP1 {

    public static void main(String[] args) throws InterruptedException {

        //new date
        System.out.println("****************************************");
        Supplier<Date> s = ()->new Date();
        System.out.println(s.get());

        //random name
        System.out.println("****************************************");
        Supplier<String> s2 = ()-> {
            String[] n = {"steve", "mary", "sam", "john"};
            int x = (int) (Math.random() * 4);
            return n[x];
        };
        System.out.println(s2.get());
        System.out.println(s2.get());
        System.out.println(s2.get());

        //One Time Password
        /*
        1. length = 6 char
        2. only digits
         */
        System.out.println("****************************************");
        Supplier<String> s3 = ()-> {
            String otp = "";
            for (int i=0; i<6; i++) {
                otp +=(int) (Math.random() * 10);
            }
            return otp;
        };
        System.out.println(s3.get());
        System.out.println(s3.get());

        //Random Password
        /*
        1. length = 8 char
        2. 2,4,6,8 places only digits
        3. 1,3,5,7 places only uppercase alphabet symbols and @#$ allowed
         */
        System.out.println("****************************************");
        Supplier<String> s4 = ()-> {
            String p = "";
            Supplier<Integer> d = ()->(int) (Math.random() * 10);
            String a ="abcdefghijklmnopqrstuvwxyz@#$";
            Supplier<Character> c = ()-> a.charAt((int) (Math.random() * 29));

            for (int i=1; i<=8; i++) {
                if (i%2==0){
                    p+=d.get();
                } else {
                    p+=c.get();
                }
            }
            return p;
        };
        System.out.println(s4.get());
        System.out.println(s4.get());
        System.out.println(s4.get());
        System.out.println(s4.get());
        System.out.println(s4.get());
        System.out.println(s4.get());
    }

}
