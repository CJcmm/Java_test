package com.text.array;

public class ArrayMemory {
    public static void main(String[] args) {
        int[] arr={1,2};
        //地址相同
        int[] arr2=arr;

        System.out.println(arr);
        System.out.println(arr2);

        arr2[0]=99;
        System.out.println(arr[0]);
        System.out.println(arr2[0]);
    }
}
