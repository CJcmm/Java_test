package com.text.exercise;

public class PrimeNumber {
    public static void main(String[] args) {
        //1.定义一个循环，遍历101——200之间的全部数据
        for (int i=101;i<=200;i++){
            boolean flag=false;//默认它不是素数

            //2.判断当前遍历的数据是否为素数
            for (int j=2;j<i/2;j++){  //不用写j<=i/2
                if (i%j==0){
                    flag=true;
                    break;
                }
            }
            //3.根据判断的结果选择是否输出这个数据，是素数就输出
            if (flag){
                System.out.print(i+"\t");
            }
        }
    }
}
