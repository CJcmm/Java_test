package com.text.stringaArrayList;

public class StringAPIOther {
    public static void main(String[] args) {
        //1.public int length():获取字符串长度
        String name ="我爱你";
        System.out.println(name.length());

        //public char charAt(int index):获取某个索引位置处的字符
        char c=name.charAt(1);
        System.out.println(c);

        System.out.println("----------遍历字符串中的每个字符-----------");
        for (int i = 0; i < name.length(); i++) {
            char ch=name.charAt(i);
            System.out.println(ch);
        }
        //把字符串转换成字符数组
        char[] chars=name.toCharArray();

        //截取内容(包前不包后)
        String name2="Java是最厉害的编程语言";
        String rs=name2.substring(0,9);

        //从头截到尾
        String rs2=name2.substring(4);

        //替换
        String name3="cgs最聪明";
        String rs1=name3.replace("聪明","傻猪");

        //查找是否存在
        System.out.println(name3.contains("聪明"));//true

        //判断以什么开始
        System.out.println(name3.startsWith("cgs"));

        //按照某个内容把字符串分割成字符串数组返回
        String name4="a,b,c";
        String[] names=name4.split(",");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

}
