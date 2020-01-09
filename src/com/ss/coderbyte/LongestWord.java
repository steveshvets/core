package com.ss.coderbyte;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LongestWord {

    public static String LongestWord(String str) {
        // code goes here
        String[] s = str.split(" ");
        String r = "";
        for (String v : s){
            if (r.length() < v.length()){
                r = v;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        String v = s.nextLine();
        System.out.print(LongestWord(v));
    }
}
