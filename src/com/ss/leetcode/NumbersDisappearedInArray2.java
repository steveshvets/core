package com.ss.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
stream method of Arrays class which is added in Java 8
 */
public class NumbersDisappearedInArray2 {

    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("*******************************************************************");
        Map<Integer, Integer> map =
        Arrays.stream(nums)
                .mapToObj(i->{
                    int[] x = new int[2];
                    x[0] = i;
                    x[1] = i;
                    return x;
                })
                .collect(Collectors.toMap(m->m[0],m->m[1], (m1, m2)->m1));

        List<Integer> r = new ArrayList<>();
        for (int i = nums.length; i>0; i--){
            if (!map.containsKey(i)){
                r.add(i);
            }
        }

        System.out.println(r);

        System.out.println("*******************************************************************");

        Map<Integer, Integer> map2 =
                Arrays.stream(nums)
                        .boxed()
                        .collect(Collectors.toMap(m->m,m->m, (m1, m2)->m1));

        List<Integer> r2 = new ArrayList<>();
        for (int i = 1; i<=nums.length; i++){
            if (!map2.containsKey(i)){
                r2.add(i);
            }
        }

        System.out.println(r2);


    }
}

