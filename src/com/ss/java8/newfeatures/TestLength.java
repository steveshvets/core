package com.ss.java8.newfeatures;

public class TestLength {
    public static void main(String[] args) {
        InterLength i = s-> s.length();
        System.out.println(i.getLength("steve"));
    }
}
