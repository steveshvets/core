package com.ss.java8.newfeatures.section14;

import java.time.*;

/*
Joda time api
package java.time.
 */
public class TestP1 {

    public static void main(String[] args) {

        //date now
        System.out.println("*****************************************************");
        LocalDate d1 = LocalDate.now();
        System.out.println(d1);

        //time now
        System.out.println("*****************************************************");
        LocalTime t = LocalTime.now();
        System.out.println(t);

        //what is day month
        System.out.println("*****************************************************");
        LocalDate d2 = LocalDate.now();
        int dd = d2.getDayOfMonth();
        int mm = d2.getMonthValue();
        int yyyy = d2.getYear();
        System.out.println(dd+".."+mm+".."+yyyy);
        System.out.printf("%d-%d-%d",dd,mm,yyyy);

        //what is day month
        System.out.println("*****************************************************");
        LocalTime t2 = LocalTime.now();
        int h = t2.getHour();
        int m = t2.getMinute();
        int s = t2.getSecond();
        int n = t2.getNano();
        System.out.printf("%d:%d:%d:%d",h,m,s,n);

        //both date and time
        System.out.println("*****************************************************");
        LocalDateTime dt1 = LocalDateTime.now();
        System.out.println(dt1);
        int dd2 = dt1.getDayOfMonth();
        int mm2 = dt1.getMonthValue();
        int yy2 = dt1.getYear();
        System.out.printf("%d-%d-%d", dd2, mm2, yy2);
        int h2 = dt1.getHour();
        int m2 = dt1.getMinute();
        int s2 = dt1.getSecond();
        int n2 =  dt1.getNano();
        System.out.printf("\n%d:%d:%d:%d",h2,m2,s2,n2);

        //can pass only 1 or 2 o3
        //google!!! localdatetime joda api
        System.out.println("*****************************************************");
        LocalDateTime dt2 = LocalDateTime.of(1995,05,28,12,45);
        System.out.println(dt2);
        System.out.println("after 9 month " + dt2.plusMonths(9));

        //Period
        System.out.println("*****************************************************");
        LocalDate birthday = LocalDate.of(1989, 8, 28);
        LocalDate today = LocalDate.now();
        Period p = Period.between(birthday, today);
        System.out.printf("your age is %d years %d months %d days",p.getYears(), p.getMonths(), p.getDays());
        LocalDate deathDate = LocalDate.of(1989+60, 8, 28);
        Period p1 = Period.between(today, deathDate);
        int d3 = p1.getYears()*365 + p1.getMonths()*30+p1.getDays();
        System.out.printf("\nyou will live for %d days", d3);

        //Year
        System.out.println("*****************************************************");
        Year y1 = Year.of(1980);
        if (y1.isLeap()){
            System.out.printf("%d leap year",1980);
        } else {
            System.out.printf("%d not leap year", 1980);
        }

        //Internatiolization
        System.out.println("*****************************************************");
        ZoneId z1 = ZoneId.systemDefault();
        System.out.println(z1);

        ZoneId z2 = ZoneId.of("America/Los_Angeles"); //specific zone
        ZonedDateTime zdt2 = ZonedDateTime.now(z2);
        System.out.println(zdt2);

        //Time (Joda time api)
        System.out.println("*****************************************************");









    }
}
