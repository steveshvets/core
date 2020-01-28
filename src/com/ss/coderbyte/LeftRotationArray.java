package com.ss.coderbyte;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LeftRotationArray {

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int d = 3;

        int[] r = leftRotation(a,d);

        for(int i:r){
            System.out.println(i);
        }

    }

    public static int[] leftRotation(int[] a, int d){

        IntStream n = Arrays.stream(a).skip(d);
        IntStream o = Arrays.stream(a).limit(d);
        int[] both = IntStream.concat(n,o).toArray();
        return both;
    }
}
