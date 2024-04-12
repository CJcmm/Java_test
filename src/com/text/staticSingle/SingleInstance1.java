package com.text.staticSingle;

public class SingleInstance1 {
    /**
       饿汉单例
     定义一个公开的静态成员变量储存一个类的对象

     */
    public static SingleInstance1 instance=new SingleInstance1();
    /**
      把构造器私有起来
     */
    private SingleInstance1(){

    }
}
