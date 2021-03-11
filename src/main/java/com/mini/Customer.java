package com.mini;

public class Customer {
    public static void main(String[] args){
        List[] list ={
            new List("0013",490,0,490),
            new List("0052",1000,100,900),
            new List("0081",290,0,290),
            new List("2122",2000,200,1800),
        } ;
    for(int i=0;i<4;i++){
        list[i].print();
    }

    }


}
