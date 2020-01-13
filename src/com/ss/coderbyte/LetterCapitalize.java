package com.ss.coderbyte;

import java.util.Scanner;

public class LetterCapitalize {

    public static String LetterCapitalize(String str) {
        // code goes here
        System.out.println(str);
        StringBuilder sb = new StringBuilder();
        String[] s = str.split(" ");
        for (int i=0; i < s.length; i++){
            s[i] = s[i].substring(0,1).toUpperCase() + s[i].substring(1);
            sb.append(s[i].substring(0,1).toUpperCase());
            sb.append(s[i].substring(1));
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        String v = s.nextLine();
        System.out.print(LetterCapitalize(v));
    }
}
