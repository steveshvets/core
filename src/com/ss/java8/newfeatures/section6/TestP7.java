package com.ss.java8.newfeatures.section6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*
return of Predicate is always boolean
 */
public class TestP7 {

    public static void main(String[] args) {
        List<SoftwareEngineer> l = new ArrayList<>();
        SoftwareEngineer s1 = new SoftwareEngineer("steve", 37, true);
        l.add(s1);
        SoftwareEngineer s2 = new SoftwareEngineer("rob", 38, false);
        l.add(s2);
        SoftwareEngineer s3 = new SoftwareEngineer("bob", 12, true);
        l.add(s3);
        SoftwareEngineer s4 = new SoftwareEngineer("mark", 13, false);
        l.add(s4);
        SoftwareEngineer s5 = new SoftwareEngineer("john", 21, true);
        l.add(s5);

        Predicate<SoftwareEngineer> allowed = s->s.getAge()>=21 && s.isHavingGf();
        for (SoftwareEngineer s : l) {
            if (allowed.test(s)) {
                System.out.println("allowed " + s);
            } else {
                System.out.println("not allowed " + s);
            }
        }


    }


}
