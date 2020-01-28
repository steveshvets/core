package com.ss.coderbyte;

import java.util.Arrays;
import java.util.stream.Stream;

public class SecondGreatestLow {

    public static String SecondGreatLow(int[] a) {

        Arrays.sort(a);

        for (int x:a) {
            System.out.println(x);
        }

        return a[1] + " " + a[a.length-2];

    }

    public static String SecondGreatLow2(int[] a) {

        int[]r = Arrays.stream(a).sorted().toArray();

        for (int x:a) {
            System.out.println(x);
        }

        return a[1] + " " + a[a.length-2];

    }

    public static void main(String[] args) {
        int[] a = {4,7,3,9,5,2};

        System.out.println(SecondGreatLow(a));
        System.out.println("***********************************************************");
        System.out.println(SecondGreatLow2(a));
        System.out.println("***********************************************************");
    }
}
