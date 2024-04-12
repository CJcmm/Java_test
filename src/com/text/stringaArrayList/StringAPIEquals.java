package com.text.stringaArrayList;

import java.util.Scanner;

public class StringAPIEquals {
    public static void main(String[] args) {
        //正确登录名和密码
        String okName="ability";
        String okPassword="123456";

        for (int i=1;i<=3;i++) {
            Scanner sc=new Scanner(System.in);
            System.out.println("用户名：");
            String Name=sc.next();
            System.out.println("登录密码：");
            String Password=sc.next();

            //判断登录名和密码是否正确
            if (okName.equals(Name)) {
                if (okPassword.equals(Password)){
                    System.out.println("登录成功！");
                    break;
                }else {
                    System.out.println("您的密码不正确，您还剩余"+(3-i)+"次机会登录");
                }
            } else {
                System.out.println("您的用户名不正确，您还剩余"+(3-i)+"次机会登录");
            }
        }
        //验证码（比对不区分大小写）
        String s1="Ability";
        String s2="ability";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
