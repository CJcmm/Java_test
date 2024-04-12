package com.text.exercise;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        //录入6个评委的分数到数组中
        double[] arr = new double[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的打分");
            int score = sc.nextInt();
            arr[i] = score;
        }
        double sum = 0;
        double max = arr[0];
        double min = arr[0];
        double score = 0;
        for (int i = 0; i < arr.length ; i++) {
            max = arr[i] > max ? arr[i] : max;
            min = arr[i] < min ? arr[i] : min;
            sum += arr[i];
        }
        score = (sum - max - min) / (arr.length - 2);
        System.out.println("最高分是"+max+"\t"+"最低分是"+min);
        System.out.println("最终得分：" + score + "分");
    }
}
