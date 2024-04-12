package com.text.object;

public class ThisCar {
    String name;
    int price;
    public ThisCar(String name,int price){
        this.name=name;
        this.price=price;
    }
    public void Car(String name){
        System.out.println(this.name+"正在和"+name+"比赛");
        System.out.println(this);
    }
}
