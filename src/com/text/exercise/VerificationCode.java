package com.text.exercise;
/*
    定义一个方法实现随机生成一个5位的验证码，每位可能是数字、大写或小写字母
 */
import java.util.Random;

public class VerificationCode {
    public static void main(String[] args) {
        String code=createCode(5);
        System.out.println("随机验证码为："+code);
    }
    //1.定义一个方法，生成验证码返回，返回类型是字符串
    public static String createCode(int n) {
        String code="";
        Random r=new Random();
        for (int i=0;i<=n;i++){

            int type=r.nextInt(3);
            switch (type){
                case 0:
                    //大写字符
                    char Ch=(char)(r.nextInt(65,91));
                    code+=Ch;
                    break;
                case 1:
                    //小写字符
                    char ch=(char)(r.nextInt(97,123));
                    code+=ch;
                    break;
                case 2:
                    //数字字符
                    code+=r.nextInt(10);
                    break;
            }
        }
        return code;
    }
}
