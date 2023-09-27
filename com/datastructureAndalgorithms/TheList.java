package com.datastructureAndalgorithms;

import java.util.ArrayList;
import java.util.List;

public class TheList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Orange");
        list.add("Grapes");
        list.add("Banana");

        System.out.println(list.size());
        System.out.println(list.contains("Apple"));
        System.out.println(list.contains("Cherry"));
        System.out.println(list);

        for(String fruits: list){
            System.out.println(fruits);
        }

        for(int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
