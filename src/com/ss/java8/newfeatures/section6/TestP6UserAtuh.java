package com.ss.java8.newfeatures.section6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*
return of Predicate is always boolean
 */
public class TestP6UserAtuh {

    public static void main(String[] args) {
        List<User> l = new ArrayList<>();
        User u1 = new User("steve", "12345");
        l.add(u1);
        User u2= new User("rob", "");
        l.add(u2);
        User u3= new User("bob", null);
        l.add(u3);
        User u4= new User(" ", "12345");
        l.add(u4);
        User u5= new User(null, "12345");
        l.add(u5);

        Predicate<String> isNotNullAndNotEmpty = s-> s!=null && s.trim().length()>0;
        Predicate<User> isValidUser = u->isNotNullAndNotEmpty.test(u.getUsername() ) && isNotNullAndNotEmpty.test(u.getPwd());
        for (User u : l) {
            if (isValidUser.test(u)) {
                System.out.println("p1 name " + u.getUsername());
            } else {
                System.out.println("invalid user or password: " + u);
            }
        }


    }


}
