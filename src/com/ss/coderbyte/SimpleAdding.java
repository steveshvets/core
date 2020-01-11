package com.ss.coderbyte;

import java.util.Scanner;

public class SimpleAdding {

    public static int SimpleAdding(int num) {
        // code goes here
        System.out.println(num);
        if (num==0){
            return num;
        }
        return num + SimpleAdding(num-1);

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        String v = s.nextLine();
        System.out.print(SimpleAdding(Integer.valueOf(v)));
    }
}
