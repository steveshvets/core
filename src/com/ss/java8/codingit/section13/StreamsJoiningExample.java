package com.ss.java8.codingit.section13;

import com.ss.java8.codingit.data.Student;
import com.ss.java8.codingit.data.StudentDataBase;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsJoiningExample {

    public static void main(String[] args) {

        String r = StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining());

        System.out.println(r);

        String r2 = StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining(","));

        System.out.println(r2);

        String r3 = StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining(",", "(", ")"));

        System.out.println(r3);
    }


}
