package com.ss.java8.codingit.section10;

import com.ss.java8.codingit.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {
    public static void main(String[] args) {

        List<String> names = StudentDataBase.getAllStudents().stream()
                .map(s->s.getName())
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(names);


        Set<String> nameSet = StudentDataBase.getAllStudents().stream()
                .map(s->s.getName())
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

        System.out.println(nameSet);

    }

}
