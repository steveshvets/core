package com.ss.java8.codingit.section10;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RealInterviewStudentAvgExample2 {

    public static void main(String[] args) {


        String[][] students = {
                {"a", "3.5"},
                {"b", "3.7"},
                {"c", "3.7"},
                {"d", "4.0"},
                {"d", "3.2"},
        };

//        for (String[] x :students) {
//            System.out.println(x[0] + "," + x[1]);
//        }

        List<String[]> list =
                Stream.of(students)
                        .collect(Collectors.toList());
        System.out.println(list);


//        Map<String, String[]> nameGpaGroupedBy =

//        System.out.println("*******************************************************");
//        Map <String, Optional<String[]>> m =
//                Stream.of(students)
//                .peek(s-> System.out.println(s[0] + "," + s[1]))
//                .collect(Collectors.groupingBy(s -> s[0],
//                        Collectors.maxBy(new Comparator<String[]>() {
//                            @Override
//                            public int compare(String[] s1, String[]st1) {
//                                if
//                            }
//                        }Comparator.compare((s1, s2) -> {
//                            System.out.println("inside s1.length=" + s1.length + " s1[0]=" + s1[0] + " s1[1]=" + s1[1]);
//                            System.out.println("inside s2.length=" + s2. + " s2[0]=" + s2[0] + " s2[1]=" + s1[1]);
//                            return s[1];
//                        }))))
//                );
//        System.out.println("*******************************************************");
//        for (Map.Entry <String, Optional<String[]>> e: m.entrySet()){
//            System.out.println("key=" + e.getKey());
//            String[] v = e.getValue().get();
//            for (String l : v){
//                System.out.println("value=" + l);
//            }
//        }



        System.out.println("*******************************************************");

        System.out.println("*******************************************************");
//        for (Map.Entry <String, Optional<String[]>> e: m.entrySet()){
//            System.out.println("key=" + e.getKey());
//            String[] v = e.getValue().get();
//            for (String l : v){
//                System.out.println("value=" + l);
//            }
//        }


//        Optional o =
//                Stream.of(students)
//                        .peek(s-> System.out.println(s[0] + "," + s[1]))
//                        .collect(Collectors.groupingBy(s -> s[0], Collectors.summingDouble((a)->{
//
//                            String val = a[1];
////                           double val = Double.valueOf(s[1]);
////                           return val;
//                        })));
//        System.out.println(o.get());






//
//
//        Optional<Map<String, Double>> max= nameGpaGroupedBy.entrySet().stream()
//                .map((e)->{
//                    List<String[]> items = e.getValue();
//                    double sum = 0;
//                    for (String[] item: items){
//                        sum+= Double.valueOf(item[1]);
//                    }
//                    double avg = sum/items.size();
//                    Map<String, Double> newE = new HashMap<>();
//                    newE.put(e.getKey(),avg);
//                    return newE;
//                })
//                .peek(System.out::println)
//                .reduce((e1,e2)->{
//                    Double avg1 = (Double) e1.values().toArray()[0];
//                    Double avg2 = (Double) e2.values().toArray()[0];
//                    if (avg1<avg2){
//                        return e2;
//                    } else {
//                        return e1;
//                    }
//                });
//
//        if (max.isPresent()){
//            System.out.println("max " + max.get());
//        }

//        System.out.println(nameGpaGroupedBy);
        }

}