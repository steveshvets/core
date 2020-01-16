package com.ss.coderbyte;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("I love you"));
        System.out.println(Palindrome.isPalindrome("R acec ar"));
    }

    public static boolean isPalindrome(String s) {

        String p = s.toLowerCase().replaceAll("[^a-z]","");
        System.out.println(p);

        return ( new StringBuilder(p).reverse().toString().equals(p));

    }
}
