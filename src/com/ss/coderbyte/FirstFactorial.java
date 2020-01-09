package com.ss.coderbyte;

import java.util.Scanner;

public class FirstFactorial {

    public static int FirstFactorial(int num) {
        // code goes here
        System.out.println(num);
        int f= num;
        if ( f == 0 || f == 1 || f == -1) {
            return f;
        } else if (f > 0) {
            f= f-1;
        } else if (num < 0){
            f=f+1;
        }

        return num*FirstFactorial(f);
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        String v = s.nextLine();
        System.out.print(FirstFactorial(Integer.valueOf(v)));
    }
}
