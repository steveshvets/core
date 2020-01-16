package com.ss.java8.newfeatures;

/*
perfectly valid functional interface only 1 m1 method
important for lambda
 */
@FunctionalInterface
public interface Interf {
    public void m1();
    default void m2(){

    }
    public static void m3(){

    }
}
