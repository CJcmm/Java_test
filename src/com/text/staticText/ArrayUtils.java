package com.text.staticText;

public class ArrayUtils {

    private ArrayUtils(){

    }
     public static String toString(int[] arr) {
         if (arr!=null) {
             String code="";
             System.out.print("[");
             for (int i = 0; i < arr.length; i++) {
                 code+=i==arr.length-1?arr[i]:arr[i]+",";
             }
             code+="]";
             return code;
         }else {
             return null;
         }
     }
     public static double getAerage(int[] arr){
        int max=arr[0];
        int min=arr[0];
        int sum=0;
         if (arr.length<3){
             return -1;
         }else {
             for (int i = 0; i < arr.length; i++) {
                 if(arr[i]>max){
                     max=arr[i];
                 }
                 if (arr[i]<min){
                     min=arr[i];
                 }
                 sum+=arr[i];
             }
             return (sum-max-min)*1.0/(arr.length-2);
         }
    }
}
