package com.ss.coderbyte;

import java.util.*;

public class LongestWordSolutionStream {

    public static String LongestWord(String str) {
        // code goes here
       return Arrays.stream(str.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null).toString();
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        String v = s.nextLine();
        System.out.print(LongestWord(v));
    }
}
