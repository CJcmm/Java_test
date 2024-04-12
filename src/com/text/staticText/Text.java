package com.text.staticText;

public class Text {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int[] arr2=null;
        System.out.println(ArrayUtils.toString(arr));
        System.out.println(ArrayUtils.toString(arr2));
        System.out.println(ArrayUtils.getAerage(arr));
    }
}
