package com.ss.java8.codingit.section9;

import com.ss.java8.codingit.data.Student;
import com.ss.java8.codingit.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
Collect starts process….will not happen until collect is run
 */
public class StreamsExample{

    public static void main(String[] args) {

        Predicate<Student> gradeLevel = (s)->s.getGradeLevel()>=3;
        Predicate<Student> gpaPredicate = (s)->s.getGpa()>=3.9;

        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents()
//                .stream()
                .parallelStream()
                .peek(System.out::println)
                .filter(gradeLevel)
                .filter(gpaPredicate)
                .collect(Collectors.toMap(Student::getName,Student::getActivities));

        System.out.println(studentMap);

    }
}
