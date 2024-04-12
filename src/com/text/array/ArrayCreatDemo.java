package com.text.array;

public class ArrayCreatDemo {
    public static void main(String[] args) {
//        数据类型[] 数组名 = new 数据类型[]{元素1,元素2,元素3};
//        静态数组
//        int[] arr=new int[]{1,2,3};
        int[] arr={1,2,3};//简易版
//        动态数组
        int[] arr1=new int[4];

        //求和
        int[] arr2=new int[]{1,2,3,4};
        int sum=arr2[0];        //定义一个默认变量用于存储最大值元素，建议使用第一个元素，若变量为0，元素都小于0，便会影响判断
        for (int i = 0; i < arr2.length; i++) {
           sum+=arr2[i];
        }
        System.out.println("sum为"+sum);

        //求最值
        int max=0;
        for (int i = 0; i < arr2.length-1; i++) {
           max= arr2[i]>arr2[i+1]?arr2[i]:arr2[i+1];
        }
        System.out.println("max为"+max);
    }
}
