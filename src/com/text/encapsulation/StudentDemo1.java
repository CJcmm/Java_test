package com.text.encapsulation;
//封装
public class StudentDemo1 {
    private int age;
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age>=0 && age<=200){
            this.age=age;
        }else {
            System.out.println("年龄非法！");
        }
    }

}
