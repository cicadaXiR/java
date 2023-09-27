package com.datastructureAndalgorithms;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class TheArray {
    public static void main(String[] args) {
        String[] colours = new String[5];
        colours[0] = "Red";
        colours[1] = "Blue";
        colours[4] = "Green";
        System.out.println(colours[0]="yellow");
        System.out.println(Arrays.toString(colours));

        System.out.println("**********************************************************");

        for (int i = 0; i < colours.length; i++){
            System.out.println(colours[i]);
        }
        System.out.println("**********************************************************");
        for(int j= colours.length-1; j>=0; j--){
            System.out.println(colours[j]);
        }
        System.out.println("**********************************************************");
        for(String color : colours){
            System.out.println(color);
        }
        System.out.println("**********************************************************");
        Arrays.stream(colours).forEach(System.out::println);
    }
}
