package com.text.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayStaffSort {
    public static void main(String[] args) {
        //录入一组工号
        Scanner sc=new Scanner(System.in);
        int[] codes=new int[5];
        for (int i = 0; i < codes.length; i++) {
            System.out.println("请输入第"+(i+1)+"个员工的工号");
            codes[i]=sc.nextInt();
        }
        Random number=new Random();
        //遍历数组，然后随机一个索引数出来，让该元素与随机索引位置出的元素值进行交换
        for (int i = 0; i < codes.length; i++) {
            //随机索引
            int index=number.nextInt(1,codes.length);

            int temp =codes[i];
            codes[i]=codes[index];
            codes[index]=temp;
        }
        System.out.println("员工工号排名顺序是：");
        for (int i = 0; i < codes.length; i++) {
            System.out.println(codes[i]);
        }
    }
}
