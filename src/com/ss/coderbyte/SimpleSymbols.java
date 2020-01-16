package com.ss.coderbyte;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleSymbols {

    public static boolean SimpleSymbols(String str) {
        // code goes here
        System.out.println(str);
        return str.matches("(?=(\\+[A-Za-z]\\+))");
//        int patternCount = 0;
//        Matcher patternMatch = Pattern.compile("(?=(\\+[A-Za-z]\\+))").matcher(str);
//        while (patternMatch.find()) {
//            patternCount++;
//        }
//        System.out.println("patternCount " + patternCount);

//        return false;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        String v = s.nextLine();
        System.out.print(SimpleSymbols(v));
    }
}
