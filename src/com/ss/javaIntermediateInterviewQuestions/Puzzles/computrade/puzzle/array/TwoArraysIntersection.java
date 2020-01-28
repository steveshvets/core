package com.ss.javaIntermediateInterviewQuestions.Puzzles.computrade.puzzle.array;

import java.util.*;

public class TwoArraysIntersection {

    public static void main(String[] args) {
        int[] nums2= {1,2,2,1};
        int[] nums1 = {2,2};


        int[] inter =
                Arrays.stream(nums1)
                        .distinct()
                        .peek(System.out::println)
                        .filter((n1) -> {
                            boolean f = Arrays.stream(nums2).distinct().anyMatch(n2 -> n2 == n1);
                            return f;
                        })
                        .toArray();

        for (int x : inter){
            System.out.println("x " + x);
        }

    }

    public static void Option2(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Hello, World!");
        strings.add("Welcome to CoderPad.");
        strings.add("This pad is running Java " + Runtime.version().feature());

        for (String string : strings) {
            System.out.println(string);
        }

        int[] nums2= {1,2,2,1};
        int[] nums1 = {2,2};

        Set<Integer> s1 = new HashSet<>();
        for (int n1 : nums1){
            s1.add(n1);
        }
        Set<Integer> s2 = new HashSet<>();
        for (int n2 : nums1){
            s2.add(n2);
        }

        List<Integer> intersection = new ArrayList<Integer>();
        for (Integer x: s1){
            if (s2.contains(x)){
                intersection.add(x);
            }
        }

        int[] r = intersection.stream().mapToInt(x->x).toArray();

        for(int e: r){
            System.out.println(e);
        }
    }

}
