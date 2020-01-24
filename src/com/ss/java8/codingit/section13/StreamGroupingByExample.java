package com.ss.java8.codingit.section13;

import com.ss.java8.codingit.data.Student;
import com.ss.java8.codingit.data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

public class StreamGroupingByExample {

    public static void main(String[] args) {

        Map<String, List<Student>> map = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGender));
        System.out.println(map);

        System.out.println("******************************************************************************");
        Map<String, List<Student>> customizedMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(s->s.getGpa()>=3.8?"OUTSTANDING":"AVERAGE"));
        System.out.println(customizedMap);

        System.out.println("******************************************************************************");
//two level grouping
        Map<Integer, Map<String, List<Student>>> twoLevel = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.groupingBy(student2->student2.getGpa()>=3.8?"OUT":"AVE")));
        System.out.println(twoLevel);

        System.out.println("******************************************************************************");
        Map<Integer, Integer> twoLevel2 = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.summingInt(Student::getNoteBooks)));
        System.out.println(twoLevel2);

//        threeArgument
        System.out.println("******************************************************************************");
        LinkedHashMap<String, Set<Student>> r =
        StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new,Collectors.toSet()));
        System.out.println(r);

        //calculate top gpa student in each grade
        System.out.println("******************************************************************************");
        Map<Integer, Optional<Student>> topGpa =
                StudentDataBase.getAllStudents().stream()
                        .collect(Collectors.groupingBy(Student::getGradeLevel,
                                Collectors.maxBy(Comparator.comparing(Student::getGpa))));
        System.out.println(topGpa);

        //get rid of optional --> calculate top gpa student in each grade
        System.out.println("******************************************************************************");
        Map<Integer, Student> topGpa2 =
                StudentDataBase.getAllStudents().stream()
                        .collect(Collectors.groupingBy(Student::getGradeLevel,
                                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
        System.out.println(topGpa2);

        //get rid of optional --> calculate least gpa student in each grade
        System.out.println("******************************************************************************");
        Map<Integer, Student> minGpa =
                StudentDataBase.getAllStudents().stream()
                        .collect(Collectors.groupingBy(Student::getGradeLevel,
                                Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa)), Optional::get)));
        System.out.println(minGpa);


    }

}
