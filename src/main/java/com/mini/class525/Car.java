package com.mini.class525;

import java.util.Date;

public class Car {
    String id;
    Date enter;
    public Car(String id){
        this.id = id;
        enter = new Date();
    }
    public Car(String id ,String time){
        this.id = id;
    }
}
