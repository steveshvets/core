package com.ss.javaIntermediateInterviewQuestions.Arrays.computrade.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicates2 {

    public static void main(String[] args) {

        int[] a = {2,4,7,9,4,5,8,1};

        List<Integer> l = Stream.of(a)
                .flatMapToInt(x-> Arrays.stream(x))
                .boxed()
                .distinct().collect(Collectors.toList());
        System.out.println(l);

        Set<Integer> s = Stream.of(a)
                .flatMapToInt(x-> Arrays.stream(x))
                .boxed()
//                .distinct()
                .collect(Collectors.toSet());
        System.out.println(s);

        //excellent solution. way better
        List<Integer> l2 = Arrays.stream(a)
                .boxed()
                .distinct().collect(Collectors.toList());
        System.out.println(l2);

    }

}
