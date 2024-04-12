package com.text.random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        Random guess=new Random();
        //输出1——10的随机数
        for(int i=0;i<10;i++){
            int data = guess.nextInt(10)+1; //0——9的随机数再+1——>1——10的随机数
            System.out.println(data);
        }
        System.out.println("*****************************");
        //输出3——17的随机数
        for(int i=0;i<10;i++){
            int data = guess.nextInt(15)+3; //1——14的随机数再+3——>3——17的随机数
            System.out.println(data);
        }
        System.out.println("*****************************");
        //jdk17才能使用
        //输出10——30的随机数
        Random bb=new Random();
        for(int i=0;i<10;i++){
            int data = bb.nextInt(10,31); //1——14的随机数再+3——>3——17的随机数
            System.out.println(data);
        }
    }
}
