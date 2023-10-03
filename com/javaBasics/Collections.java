package com.javaBasics;

import java.util.ArrayList;

class MyArray{
   public void arrayItems(){
       String [] items = new String[5];
       for(int i=1; i<=items.length; i++){
           System.out.println(i);
       }
   }
}
public class Collections {
    public static void main(String[] args) {
        //ArrayList
        MyArray array = new MyArray();
        ArrayList<MyArray> Names = new ArrayList<>();
        Names.add(array);
        for(MyArray name:Names){
            name.arrayItems();
        }
    }
}
