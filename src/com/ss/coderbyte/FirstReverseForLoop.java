package com.ss.coderbyte;

import java.util.Scanner;

public class FirstReverseForLoop {

    public static String FirstReverse(String str) {
        // code goes here
        System.out.println(str);
        byte[] r = new byte[str.length()];
        byte[] b = str.getBytes();

        int c =  str.length() - 1;
        for (int i=0; i<str.length(); i++){
            r[i] = b[c];
            c--;
        }

        return new String(r);
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        String v = s.nextLine();
        System.out.print(FirstReverse(v));
    }
}
