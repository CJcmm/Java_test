package com.text.object.shopcar;

//1.定义商品类，用于后期创建商品对象
public class Goods {
    private int id;//编号
    private String name;//名称
    private double price;//价格
    private int buyNumber;//购买数量

    public Goods() {
    }

    public Goods(int id, String name, double price, int buyNumber) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.buyNumber = buyNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBuyNumber() {
        return buyNumber;
    }

    public void setBuyNumber(int buyNumber) {
        this.buyNumber = buyNumber;
    }
}
