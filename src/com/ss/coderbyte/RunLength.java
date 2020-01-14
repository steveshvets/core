package com.ss.coderbyte;

import java.util.Scanner;

public class RunLength {

    public static String checkNums(String str) {
        // code goes here
        System.out.println(str);
        StringBuilder sb = new StringBuilder();
        char[] c = str.toCharArray();
        char prev = c[0];
        int ctr = 0;
        for (int i=0; i < c.length ; i++){
            if (c[i] != prev){
                sb.append(ctr).append(prev);
                ctr = 0;
                prev = c[i];
            }
            ctr++;
        }
        sb.append(ctr).append(c[c.length-1]);
        return sb.toString();

    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        String v = s.nextLine();
        System.out.println(checkNums(v));

    }
}
