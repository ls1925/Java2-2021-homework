package com.mini.class525;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Class525 {
    public static void main(String[] args) {
        Map<String, Car> cars = new HashMap<>();
        Car c1 = new Car("abc-123","14:41");
        Car c2 = new Car("xyz-888","12:50");
        Car c3 = new Car("ghe - 123","13:06");
        cars.put(c1.id,c1);
        cars.put(c2.id,c2);
        cars.put(c3.id, c3);
        String id = "abc-123";
        Car car = cars.get(id);
        if(car == null ){
            System.out.println("Car not found");
        }else{
            Date now = new Date();
            long ms = now.getTime() - car.enter.getTime();
            long mins = ms/(1000*60);
            System.out.println(mins);
        }


    }
}
