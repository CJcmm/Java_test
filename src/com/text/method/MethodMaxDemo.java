package com.text.method;

public class MethodMaxDemo {
    public static void main(String[] args) {
        int[] ages={1,2,3,4};
        int max=Max(ages);
        System.out.println("数组最大值为"+max);
    }

    public static int Max(int[] arr) {
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
