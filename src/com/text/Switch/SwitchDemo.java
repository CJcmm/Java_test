package com.text.Switch;

public class SwitchDemo {
    public static void main(String[] args) {
        //循环穿透
        String week="周六";
        switch (week){
            case "周一":
            case "周二":
            case "周三":
            case "周四":
                System.out.println("吃烧烤");
                break;
            case "周五":
            case "周六":
            case "周日":
                System.out.println("吃火锅");
                break;
        }
    }
}
