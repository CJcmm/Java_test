package com.text.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayGuessDemo {
    public static void main(String[] args) {
        Random number=new Random();
        Scanner n=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number.nextInt(1, 5);
        }
        OUT:
        while (true) {
            System.out.println("请输入您猜测的数字：");
            int guessNumber = n.nextInt();
            for (int i = 0; i < arr.length; i++) {
                if (guessNumber == arr[i]) {
                    System.out.println("恭喜您，您猜对了");
                    break OUT;
                }
            }
            System.out.println("数据在数组中不存在");
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"\t");
        }
    }
}
