package com.ss.opensystems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierDemo {

    public static void main(String[] args) throws Exception {
//        Function<String, Integer> l = (s)->s.length();
//        Function<Integer, Boolean> c = (i)->i<10;
//        Function<String, Boolean> f = l.andThen(c);
//        System.out.println(f.apply("Java 8"));

//        List<Integer> n = Arrays.asList(1,2,3,4,5);
//        List<Integer> r = n.stream().skip(2)
//                .collect(Collectors.toCollection(ArrayList::new));
//        System.out.println(r.toString());
//
//        Stream.of("m","o","b").filter(fruit->{
//            System.out.println("fruit"+ fruit);
//            return true;
//
//        });

//        List<String> f = new ArrayList<>();
//        f.add("m");
//        f.add("o");
//        f.add("b");
//        Stream<String> fruitStream = f.parallelStream();
//        fruitStream.filter(fruit->{
//            System.out.println(fruit);
//            return false;
//        }).forEach(fruit->{});
    }

    public static void  showSupplier(Supplier<String> name){
        System.out.println(""+name.get());
    }
}
