package com.text.exercise;

import java.util.Scanner;

public class BuyAriTicket {


    public static void main(String[] args) {
        double[] price={500,1000};
        Scanner sc=new Scanner(System.in);
        System.out.print("今月是：");
        int month =sc.nextInt();
        System.out.print("舱位类型（经济舱、头等舱）为：");
        String seat=sc.next();
        System.out.println("打折后"+seat+"的价格为"+discount(month,seat,price)+"元！！");
    }
    //判断淡旺季折扣
    public static double discount(int month,String seat,double[] ticket){
        int i=0;
        if (month>=5 && month<=10) {
            switch (seat){
                case "经济舱":
                    ticket[0]*=0.85;
                    break;
                case "头等舱":
                    ticket[1]*=0.9;
                    i=1;
                    break;
                default:
                    System.out.println("您输入的舱位不正确");
                    ticket[i]=-1;
            }
        }else if (month==11 && month==12 && month >=1 && month<=4){
            switch (seat){
                case "经济舱":
                    ticket[0]*=0.65;
                    break;
                case "头等舱":
                    ticket[1]*=0.7;
                    i=1;
                    break;
                default:
                    System.out.println("您输入的舱位不正确");
                    ticket[i]=-1;
            }
        }else {
            System.out.println("您输入的月份不正确");
        }
        return ticket[i];

    }
}
