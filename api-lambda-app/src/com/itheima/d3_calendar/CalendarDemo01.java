package com.itheima.d3_calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo01 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        int year = cal.get(Calendar.YEAR);
        System.out.println(year);
        cal.set(Calendar.HOUR,12);
        System.out.println(cal);

        cal.add(Calendar.DAY_OF_YEAR, 64);
        cal.add(Calendar.MINUTE, 59);
        Date d = cal.getTime();
        System.out.println(d);

    }

}
