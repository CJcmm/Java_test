package com.text.staticSingle;

public class Text {
    public static void main(String[] args) {
        SingleInstance1 s1=SingleInstance1.instance;
        SingleInstance1 s2=SingleInstance1.instance;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
    }
}
