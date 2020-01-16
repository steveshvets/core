package com.ss.java8.newfeatures;

public class TestAdd {
    public static void main(String[] args) {
        InterAdd i = (a,b)-> System.out.println("The Sum: " + (a+b));
        i.add(2,3);
        i.add(4,5);
    }
}
