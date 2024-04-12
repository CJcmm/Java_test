package com.text.random;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class RandomDemo2 {
    public static void main(String[] args) {
        Random r=new Random();
        int number = r.nextInt(10);
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("请输入您猜测的数字：");
            int guessNumber=sc.nextInt();
            if(guessNumber>number){
                System.out.println("您猜测的数过大");
            }else if(guessNumber<number){
                System.out.println("您猜测的数过小");
            }else {
                System.out.println("恭喜您猜中了！");
                break;
            }

        }
    }
}
