package com.ss.java8.codingit.section10;

import com.ss.java8.codingit.data.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RealInterviewStudentAvgExample {

    public static void main(String[] args) {
        String[][] students = {
                {"a", "3.5"},
                {"b", "3.7"},
                {"c", "3.7"},
                {"d", "4.0"},
                {"d", "3.2"},
        };

        List<String[]> list =
                Stream.of(students)
                        .collect(Collectors.toList());
        System.out.println(list);

        Map<String, List<String[]>> nameGpaGroupedBy =
                Stream.of(students)
                .peek(s-> System.out.println(s[0] + "," + s[1]))
                .collect(Collectors.groupingBy(s -> s[0]));

        Optional<Map<String, Double>> max= nameGpaGroupedBy.entrySet().stream()
                .map((e)->{
                    List<String[]> items = e.getValue();
                    double sum = 0;
                    for (String[] item: items){
                        sum+= Double.valueOf(item[1]);
                    }
                    double avg = sum/items.size();
                    Map<String, Double> newE = new HashMap<>();
                    newE.put(e.getKey(),avg);
                    return newE;
                })
                .peek(System.out::println)
                .reduce((e1,e2)->{
                    Double avg1 = (Double) e1.values().toArray()[0];
                    Double avg2 = (Double) e2.values().toArray()[0];
                    if (avg1<avg2){
                        return e2;
                    } else {
                        return e1;
                    }
                });

        if (max.isPresent()){
            System.out.println("max " + max.get());
        }
    }

}