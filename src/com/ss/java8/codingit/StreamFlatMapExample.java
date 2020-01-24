package com.ss.java8.codingit;

import com.ss.java8.codingit.data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

public class StreamFlatMapExample {

    public static void main(String[] args) {



        List<String> studentActivities = StudentDataBase.getAllStudents().stream()
                .map(s->s.getActivities())
                .flatMap(List::stream)
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println(studentActivities);

    }
}
