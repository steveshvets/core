package com.ss.java8.codingit.section13;

import com.ss.java8.codingit.data.Student;
import com.ss.java8.codingit.data.StudentDataBase;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamPartitioningByExample {

    public static void main(String[] args) {


//        returns true for gpa>3.8 and false for gpa<3.8
        System.out.println("******************************************************************************");
        Predicate<Student> gpaPredicate = student->student.getGpa()>=3.8;
        Map<Boolean, List<Student>> customizedMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(gpaPredicate));
        System.out.println(customizedMap);

//        returns true for gpa>3.8 and false for gpa<3.8
        System.out.println("******************************************************************************");
        Predicate<Student> gpaPredicate2 = student->student.getGpa()>=3.8;
        Map<Boolean, Set<Student>> customizedMap2 = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(gpaPredicate2, Collectors.toSet()));
        System.out.println(customizedMap2);



    }

}
