package com.text.javabean;

public class User {
    private String name;
    private double height;
    private int salary;

    //无参构造器

    public User() {
    }
    //有参构造器

    public User(String name, double height, int salary) {
        this.name = name;
        this.height = height;
        this.salary = salary;
    }


    //get set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
