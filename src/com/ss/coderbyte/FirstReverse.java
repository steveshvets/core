package com.ss.coderbyte;

import java.util.Scanner;

public class FirstReverse {

    public static String FirstReverse(String str) {
        // code goes here
        System.out.println(str);
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        String v = s.nextLine();
        System.out.print(FirstReverse(v));
    }
}
