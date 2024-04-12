package com.text.exercise;

import java.util.Scanner;

public class DigitalEncryption {
    public static void main(String[] args) {
        //数据加密
        System.out.println("请输入需要加密的数字个数");
        Scanner sc = new Scanner(System.in);
        int length=sc.nextInt();
        int[] arr = new int[length];
        System.out.println("请输入"+length+"位密码");
        for (int i = 0; i < arr.length; i++) {
            int number = sc.nextInt();
            arr[i] = number;
        }
        printArray(arr);
        //对数组中的数据进行加密
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(arr[i]+5)%10;
        }
        //对已加密的数据进行反转
//        for (int i = 0; i < arr.length/2; i++) {
//            int temp =arr[i];
//            arr[i]=arr[arr.length-i-1];
//            arr[arr.length-i-1]=temp;
//        }
        for (int i = 0, j = arr.length-1;i<j; i++,j--) {
            int temp =arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        printArray(arr);
    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i==arr.length-1?arr[i]:arr[i]+",");
        }
        System.out.println("]");
    }

}
