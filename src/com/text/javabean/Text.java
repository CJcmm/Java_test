package com.text.javabean;

public class Text {
    public static void main(String[] args) {
        User u=new User();
        u.setName("tyy");
        u.setHeight(170);
        u.setSalary(10000);
        System.out.println(u.getName());
        System.out.println(u.getHeight());
        System.out.println(u.getSalary());

        User u1=new User("fhjd",178,2000);
        System.out.println(u1.getName());
        System.out.println(u1.getHeight());
        System.out.println(u1.getSalary());
    }
}
