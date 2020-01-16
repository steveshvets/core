package com.ss.java8.newfeatures;

public class TestSquare {
    public static void main(String[] args) {
        InterSquare i = v->v*v;
        System.out.println(i.square(3));
    }
}
