package com.ss.java8.codingit.section10;

import com.ss.java8.codingit.data.Student;
import com.ss.java8.codingit.data.StudentDataBase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsReduceExample {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1,3,5,7);

        Optional<Integer> product = integers.stream()
                .reduce((x,y)->x*y);

        if (product.isPresent()){
            System.out.println(product.get());
        }


        Student maxGpa = StudentDataBase.getAllStudents().stream()
                .reduce((s1, s2)-> s1.getGpa()>s2.getGpa()?s1:s2).get();

        System.out.println(maxGpa);



    }
}