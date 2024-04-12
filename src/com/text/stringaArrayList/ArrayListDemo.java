package com.text.stringaArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        //1.创建ArrayList集合的对象
        ArrayList List =new ArrayList();

        //2.添加数据
        List.add("java");
        List.add("a");
        List.add("b");
        List.add("c");
        System.out.println(List.add("java"));//实际上存的数据是地址，但是通过一些继承的方法转换成了数据，返回的是Boolean类型
        System.out.println(List);

        //给指定索引位置插入元素
        List.add(1,"111");
        System.out.println(List);
    }
}
