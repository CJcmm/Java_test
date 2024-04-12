package com.text.exercise;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        //int[] arr2=arr; //没有完成数组的复制，只是都指向了同一个地址
        //1.初始化一个动态数组，长度与原数组一样
        int[] arr1=new int[arr.length];

        copy(arr,arr1);
        printArray(arr);
        printArray(arr1);
    }
    //2.遍历原数组的每个元素，依次赋值给新数组
    public static void copy(int[] arr,int[] arr1){
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=arr[i];
        }
    }
    //3.打印数组
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i==arr.length-1?arr[i]:arr[i]+",");
        }
        System.out.println("]");
    }
}
