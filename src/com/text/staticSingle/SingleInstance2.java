package com.text.staticSingle;

/**
 * 懒汉单例
 */
public class SingleInstance2 {

    private static SingleInstance2 instance2;

    private SingleInstance2(){

    }
    public static SingleInstance2 getInstance2(){
        if (instance2==null){
            instance2 =new SingleInstance2();
        }
        return instance2;
    }
}
