package com.text.object.shopcar;

import java.util.Scanner;

public class ShopCar {
    public static void main(String[] args) {
        //2.定义一个购物车对象
        Goods[] shopCar=new Goods[100];
        //3.创建功能
        while (true) {
            System.out.println("请选择功能");
            System.out.println("添加商品：add");
            System.out.println("查看商品：query");
            System.out.println("修改数量：update");
            System.out.println("结算金额：pay");
            Scanner sc=new Scanner(System.in);
            System.out.println("请您选择要操作的功能：");
            String command= sc.next();
            switch (command){
                case "add":
                    addGoods(shopCar,sc);
                    break;
                case "query":
                    queryGoods(shopCar);
                    break;
                case "update":
                    updateGoods(shopCar,sc);
                    break;
                case "pay":
                    payGoods(shopCar);
                    break;
                default:
                    System.out.println("没有该功能");
            }
        }
    }

    private static void addGoods(Goods[] shopCar,Scanner sc) {
        System.out.println("请您输入商品的编号（不重复）：");
        int id=sc.nextInt();
        System.out.println("请您输入商品的名称：");
        String name=sc.next();
        System.out.println("请您输入购买商品的数量：");
        int buyNumber=sc.nextInt();
        System.out.println("请您输入商品的价格：");
        double price=sc.nextDouble();

        //把这个购买商品的信息封装成一个商品对象
        Goods g=new Goods();
        g.setId(id);
        g.setName(name);
        g.setBuyNumber(buyNumber);
        g.setPrice(price);
        //将商品对象添加到数组中
        for (int i = 0; i < shopCar.length; i++) {
            if(shopCar[i]==null){
                shopCar[i]=g;
                break;
            }
        }
    }

    private static void queryGoods(Goods[] shopCar) {
        System.out.println("===============查询购物车信息如下===============");
        System.out.println("商品id\t\t\t商品名称\t\t\t商品单价\t\t\t商品购买数量");
        for (int i = 0; i < shopCar.length; i++) {
            Goods g=shopCar[i];
            if (g!=null){
                //展示商品
                System.out.println(g.getId()+"\t\t\t\t"+g.getName()+"\t\t\t\t\t"+g.getPrice()+"\t\t\t"+ g.getBuyNumber());
            }else {
                //遍历结束
                break;
            }
        }
    }

    private static void updateGoods(Goods[] shopCar,Scanner sc) {
        //让用户输入要修改的商品id，根据id查询要修改的商品对象
        while (true) {
            System.out.println("请您输入要修改的id");
            int id= sc.nextInt();
            Goods g=getGoodsById(shopCar,id);
            if (g==null){
                System.out.println("没有加购此商品");
            }else {
                System.out.println("请输入"+g.getName()+"商品的购买数量：");
                int buyNumber=sc.nextInt();
                g.setBuyNumber(buyNumber);
                System.out.println("修改成功!");
                queryGoods(shopCar);
                break;
            }
        }

    }
    public static Goods getGoodsById(Goods[] shopCar,int id){
        for (int i = 0; i < shopCar.length; i++) {
            Goods g=shopCar[i]; //定义一个变量接收地址
            if (g!=null){
                if (id==g.getId()){
                    return g;
                }
            }else {
                return null; //找到了已存在的商品，都没有找到
            }
        }
        return null;//找完了全部商品都没有找到
    }
    private static void payGoods(Goods[] shopCar) {
        queryGoods(shopCar);
        double total=0;
        for (int i = 0; i < shopCar.length; i++) {
            Goods g=shopCar[i];
            if (g!=null){
                total+=g.getPrice()*g.getBuyNumber();
            }else {
                System.out.println("本次商品购买的总价为："+total+"元");
                break;
            }
        }
    }
}
