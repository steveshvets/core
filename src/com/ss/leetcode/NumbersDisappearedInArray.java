package com.ss.leetcode;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
stream method of Arrays class which is added in Java 8
 */
public class NumbersDisappearedInArray {

    public static void main(String[] args) {

        int[] nums= {4,3,2,7,8,2,3,1};
        System.out.println("*******************************************************************");
        List<Integer> l00= Arrays.asList(1,2,3,4); //creates list of integers. only if you pass multiple parameters!!!!
        System.out.println("l00 " + l00);

        Arrays.stream(nums).forEach(s-> System.out.println(s));//returns IntSteam

        List<int[]> l01 = Arrays.asList(nums);//creates a list wrapped around array of integers!!! BECAUSE SINGLE PARAMETER!!!
        for (int[] x:l01){
            for (int y: x){
                System.out.println("l01 " + y);
            }
        }
        System.out.println();

        List<int[]> l1 =
        Arrays.asList(nums).stream()
                .collect(Collectors.toList()); //because Arrays.asList --> creates List<int[]> AGAIN one parameter
        for (int[] x:l1){
            for (int y: x){
                System.out.println("l1 " + y);
            }
        }

        System.out.println("*******************************************************************");
        List<Integer> l20 = Stream.of(1,2,3,4,5). // multiple parameters to Stream.of !!!!
                collect(Collectors.toList());
        for (Integer x: l20){
            System.out.println(x);
        }

        System.out.println();
        List<int[]> l2 =
        Stream.of(nums)                            // single parameter to Stream.of !!!! Just crates a wrapper
                .collect(Collectors.toList());
        for (int[] x:l2){
            for (int y: x){
                System.out.println("z1 " + y);
            }
        }
        System.out.println();
        List<Integer> l22 =
                Stream.of(nums)                            // single parameter to Stream.of !!!! Just crates a wrapper
                        .peek(s-> System.out.println(s))
                        .flatMapToInt(s-> Arrays.stream(s))
                        .boxed()
                        .collect(Collectors.toList());
        for (Integer x:l22){
                System.out.println("z2 " + x);
        }


        System.out.println("*******************************************************************");
        List<Integer> l3 =   Arrays.stream(nums).boxed().collect(Collectors.toList());

            for (Integer y: l3){
                System.out.println("l3 " + y);
            }
       }

}

