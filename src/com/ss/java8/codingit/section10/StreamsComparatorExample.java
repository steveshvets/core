package com.ss.java8.codingit.section10;

import com.ss.java8.codingit.data.Student;
import com.ss.java8.codingit.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public static void main(String[] args) {



        List<Student> studentActivities = StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

        System.out.println(studentActivities);


        List<Student> gpaSorted = StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());

        System.out.println(gpaSorted);
    }
}
