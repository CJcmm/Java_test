package com.text;

public class extendsText {
    public static void main(String[] args) {
        Student s=new Student();
//      System.out.println(s.age);
        //子类没有继承父类的静态成员，只是共享
        Student.inAdd();
        System.out.println(Student.onLineNumber);
    }
}
class People{
    private int age=21;
    private void run(){
        System.out.println("相信");
    }

    public static int onLineNumber=161;
    public static void inAdd(){
        System.out.println("自己");
    }
}
class Student extends People{

}