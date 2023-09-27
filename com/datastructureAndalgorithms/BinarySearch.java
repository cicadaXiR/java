package com.datastructureAndalgorithms;
class Info1{
    int binarySearch(int array[], int first, int last, int key){
        while (first <= last){
            int middle = (first + last) / 2;

            if(array[middle] == key){
                return middle;
            } else if (array[middle] > key)
            {
                first = middle - 1;
            }
            else{
                last = middle + 1;
            }
        }
        return -1;
    }
}
public class BinarySearch {
    public static void main(String[] args) {
        Info1 info = new Info1();

        int array [] = {2,4,5,6,7,8,9};
        int size = array.length;
        int key = 4;

        int result = info.binarySearch(array,0,size-1,key);

        if(result == -1){
            System.out.println("Element is not found");
        }else{
            System.out.println("Element is found in the position" + result);
        }
    }
}
