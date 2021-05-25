package com.mini.class525;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Class525 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        try {
            Date d = sdf.parse("08:31");
            System.out.println(d);
        }catch (ParseException e ){
            e.printStackTrace();
        }
        //
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());

        Car c1 = new Car("abc-123");
        Car c2 = new Car("xyz-888","02:50");
        System.out.println(c1.enter);
        Date now = new Date();
        System.out.println(now.getTime());
        long dis = now.getTime() - c1.enter.getTime();
        System.out.println(dis);
    }
}
