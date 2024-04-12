package com.text.staticAttention;

/*
        总结：
        1.静态方法只能访问静态成员，不可以直接访问实例成员
        2.实例方法可以直接访问静态成员，也可以访问实例成员
        3.静态方法不可以出现this关键字
 */
public class Text {
    //静态成员
    public static int onLineNumber;
    //实例成员
    private String name;

    public static void getMax(){
        //静态方法可以直接访问静态成员
        System.out.println(Text.onLineNumber);//通过类名访问
        System.out.println(onLineNumber);//这个静态方法和静态成员在同一类里面

        //静态方法不能出现this关键字(因为this是指当前对象)
        //System.out.println(this);

        //静态方法不可以直接访问实例成员,但是可以间接通过创建对象访问
        Text t=new Text();
        System.out.println(t.name);
    }

    public void run(){
        //实例方法可以直接访问静态成员，也可以访问实例成员(因为他们都是通过对象来访问的)
        System.out.println(onLineNumber);
        System.out.println(Text.onLineNumber);
        System.out.println(name);

        Text.getMax();
        getMax();

        sing();
    }
    public void sing(){

    }

    public static void main(String[] args) {

    }
}
