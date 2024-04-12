package com.text.stringaArrayList;

import java.util.ArrayList;
//删除80以下的成绩
public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> scores=new ArrayList<>();
        scores.add(98);
        scores.add(77);
        scores.add(66);
        scores.add(89);
        scores.add(79);
        scores.add(50);
        scores.add(99);
        System.out.println(scores);

        //遍历
//        for (int i = 0; i < scores.size(); i++) {
//            int score=scores.get(i);
//            if (score<80){
//                scores.remove(i);
//            }
//        }
//        System.out.println(scores);

        //从集合后面遍历删除，可以避免漏掉元素
        for (int i = scores.size()-1; i >=0 ; i--) {
            int score=scores.get(i);
            if (score<80){
                scores.remove(i);
            }
        }
        System.out.println(scores);
    }
}
