package com.datastructureAndalgorithms;

class Info{
    public int linearSearch(int[] array,int size,int key){
        for(int i=0; i<size;i++){
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }
}
public class LinearSearch {
    public static void main(String[] args) {

        Info info = new Info();

        int array[] = {2,4,1,0,56,90,56,33,61};
        int size = array.length;
        int key = 0;

        int search = info.linearSearch(array,size,key);

        if(search == -1){
            System.out.println("Element is not found in the Array");
        }else {
            System.out.println("Element found at the position" +  search);
        }
    }
}
