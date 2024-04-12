package com.text.stringaArrayList.movie;

import java.util.ArrayList;

//集合存储自定义元素并遍历
public class MovieText {
    public static void main(String[] args) {
        ArrayList<Movie> movies=new ArrayList<>();

//        Movie m1=new Movie("《肖生克的救赎》",9.7,"罗宾斯");
//        movies.add(m1);
        movies.add(new Movie("《肖生克的救赎》",9.7,"罗宾斯"));
        movies.add(new Movie("《霸王别姬》",9.6,"张国荣"));
        movies.add(new Movie("《阿甘正传》",9.5,"汤姆汉克斯"));

        System.out.println(movies);//打印出来的是地址，集合里面装的是对象的地址
        for (int i = 0; i < movies.size(); i++) {
            Movie movie =movies.get(i);
            System.out.println("片名:"+movie.getName());
            System.out.println("评分:"+movie.getScore());
            System.out.println("演员:"+movie.getActor());
        }
    }
}
