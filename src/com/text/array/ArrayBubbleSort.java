package com.text.array;

public class ArrayBubbleSort {
    public static void main(String[] args) {
        //冒泡排序
        int[] arr={5,2,3,1};
        for (int j = 1; j <= arr.length-1; j++) {
            //j ==1 比较次数 3  i = 1 2 3
            //j ==2 比较次数 3  i = 1 2
            //j ==3 比较次数 3  i = 1
            for (int i = 0; i < arr.length-j; i++) {
                if (arr[i]>arr[i+1]){
                    int temp =arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
