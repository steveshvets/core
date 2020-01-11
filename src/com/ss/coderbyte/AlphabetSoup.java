package com.ss.coderbyte;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabetSoup {

    public static String AlphabetSoup(String s) {
        // code goes here
        System.out.println(s);
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        String v = s.nextLine();
        System.out.print(AlphabetSoup(v));
    }
}
