package com.ss.coderbyte;

import java.util.Scanner;

public class CheckNums {

    public static String checkNums(int num1, int num2) {
        // code goes here
        System.out.println(num1 + " " + num2);
        int r = num2 - num1;

        if (r == 0)
            return "-1";
        else if (r > 0)
            return "true";
        else
            return "false";
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        String v = s.nextLine();
        System.out.println(checkNums(1, 1));
        System.out.println(checkNums(1, 3));
        System.out.println(checkNums(4, 3));
    }
}
