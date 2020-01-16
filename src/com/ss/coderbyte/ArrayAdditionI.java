package com.ss.coderbyte;

import java.util.Arrays;

public class ArrayAdditionI {
    public static void main(String[] args) {

        int[] i = {1,2,3,4,5};
        int[] i2= {1,2,3,4,5,15};

        System.out.println(ArrayAdditionI.ArrayAdditionI(i));
        System.out.println(ArrayAdditionI.ArrayAdditionI(i2));
    }

    public static boolean ArrayAdditionI(int[] arr) {

        int max = Arrays.stream(arr).max().getAsInt();
        int sum = Arrays.stream(arr).filter(v->v != 23).sum();

        return max == sum;

    }
}
