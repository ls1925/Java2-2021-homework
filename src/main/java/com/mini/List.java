package com.mini;

public class List {
    String customerid;
    int cost;
    int discount;
    int price;
    public List(String customerid,int cost,int discount,int price){
        this.cost = cost;
        this.customerid =customerid;
        this.discount = discount;
        this.price = price;
    }
    public void print(){
        if(discount ==0){
            System.out.println(customerid + "\t" + cost + "\t" +"\t"+ discount + "\t" + price);
        }else{
            System.out.println(customerid + "\t" + cost + "\t" + discount + "\t" + price);
        }
            }

}
