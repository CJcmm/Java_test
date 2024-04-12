package com.text.object;

public class ThisDemo {
    public static void main(String[] args) {
        ThisCar c=new ThisCar("宝马",100);
        System.out.println(c.name+"\t"+c.price);
        c.Car("奔驰");
        System.out.println(c);
    }

}
