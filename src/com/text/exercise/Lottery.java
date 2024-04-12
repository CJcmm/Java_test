package com.text.exercise;

import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        int[] luckNumbers = creatLuckNumbers();
        printNumber(luckNumbers);
        int[] userNumbers = userInputNumber();


        System.out.print("中奖号码为");
        printNumber(luckNumbers);
        System.out.print("您投注号码为");
        printNumber(userNumbers);
        judge(luckNumbers, userNumbers);
    }

    //1.随机一组中奖号码返回
    public static int[] creatLuckNumbers() {
        Random r = new Random();
        int[] luckNumbers = new int[7];
        //红球号码
        for (int i = 0; i < luckNumbers.length - 1; i++) {
            boolean flag=true;
            while (true) {
                int data = r.nextInt(1, 34);
                for (int j = 0; j < i; j++) {
                    if (luckNumbers[j] == data) {
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    luckNumbers[i]=data;
                    break;
                }
            }

        }
        //蓝球号码
        luckNumbers[luckNumbers.length - 1] = r.nextInt(1, 17);
        return luckNumbers;
    }

    //2.用户输入一组号码
    public static int[] userInputNumber() {
        int[] userNumbers = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < userNumbers.length - 1; i++) {
            System.out.print("请输入第"+(i+1)+"个号码");
            int red = sc.nextInt();
            if (red <= 33 && red >= 1) {
                userNumbers[i] = red;
            } else {
                System.out.println("查无此球");
                i -= 1;
            }
        }
        System.out.print("请输入第"+(userNumbers.length)+"个号码");
        int blue = sc.nextInt();
        userNumbers[userNumbers.length - 1] = blue;
        return userNumbers;
    }

    //3.输入2组号码，判断中奖情况
    public static void judge(int[] luckNumbers, int[] userNumbers) {
        System.out.println("————————————");
        int red =0;
        int blue=0;
        int i=0;
        for (i = 0; i < luckNumbers.length-1; i++) {
            for (int j = 0; j < userNumbers.length; j++) {
                if (luckNumbers[i] == userNumbers[j]) {
                    red++;
                    break;
                }
            }
        }

        blue=luckNumbers[i]==userNumbers[i]?1:0;
        if(blue==1 && red<=2){
            System.out.println("恭喜您中了5元！");
        }else if(blue==1 && red==3 || blue==0 && red==4){
            System.out.println("恭喜您中了10元！！");
        }else if(blue==1 && red==4 || blue==0 && red==5){
            System.out.println("恭喜您中了200元！！！");
        }else if(blue==1 && red==5){
            System.out.println("恭喜您中了3000元！！！！");
        }else if(blue==0 && red==6){
            System.out.println("恭喜您中了500万元！！！！！");
        }else if(blue==1 && red==6){
            System.out.println("恭喜您中了1000万元！！！！！！");
        }else if(red==0 && blue==0){
            System.out.println("谢谢惠顾");
        }
    }

    public static void printNumber(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        System.out.println("]");
    }
}

