package com.ss.java8.codingit.section13;

import com.ss.java8.codingit.data.Student;
import com.ss.java8.codingit.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupingByExample {

    public static void main(String[] args) {

        Map<String, List<Student>> map = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGender));

        System.out.println(map);

        Map<String, List<Student>> customizedMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(s->s.getGpa()>=3.8?"OUTSTANDING":"AVERAGE"));

        System.out.println(customizedMap);

//two level grouping
        Map<String, Map<String, List<Student>>> twoLevel = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getName,Collectors.groupingBy(student2->student2.getGpa()>=3.8?"OUT":"AVE")));

        System.out.println(twoLevel);

    }

}
