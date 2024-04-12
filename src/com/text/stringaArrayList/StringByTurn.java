package com.text.stringaArrayList;

public class StringByTurn  {
    public static void main(String[] args) {
        //根据字节数组创建字符对象
        char[] ch={'a','b','a','n','d','o','n'};
        String s=new String(ch);
        System.out.println(s);

        //根据字节数组创建字符对象
        byte[] b={97,98,99,65,66,67};
        String s1=new String(b);
        System.out.println(s1);
    }
}
