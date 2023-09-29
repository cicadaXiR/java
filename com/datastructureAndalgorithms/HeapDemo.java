package com.datastructureAndalgorithms;

class Heap{
    public int heapArray[];
    private int size;

    public Heap(int size){
        heapArray = new int[size];
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int getMinimum(){
        return heapArray[0];
    }
    public int leftIndexChild(int nodeIndex){
        return 2 * nodeIndex+1;
    }
    public int rightIndexChild(int nodeIndex){
        return 2 * nodeIndex+2;
    }
    public int parentIndexChild(int nodeIndex){
        return (nodeIndex-1)/2;
    }
    public boolean isFull(){
        return size == heapArray.length;
    }
    public void insert(int value){
        size++;
        heapArray[size - 1] = value;
        heapUp(size-1);
    }
    public void removeMin(){
        heapArray[0] = heapArray[size-1];
        size--;
        if(size > 0){
            heapDown(0);
        }
    }
    public void heapUp(int nodeIndex){
        int parentIndex,temp;
        if(nodeIndex != 0) {
            parentIndex = heapArray[nodeIndex];
            if (heapArray[parentIndex] > heapArray[nodeIndex]) {
                temp = heapArray[parentIndex];
                heapArray[parentIndex] = heapArray[nodeIndex];
                heapArray[nodeIndex] = temp;
                heapUp(parentIndex);
            }
        }
    }
    public void heapDown(int nodeIndex){
        int leftChildIndex,rightChildIndex,minIndex,temp;
        leftChildIndex = leftIndexChild(nodeIndex);
        rightChildIndex = rightIndexChild(nodeIndex);
        if(rightChildIndex >= size) {
            if (leftChildIndex >= size) {
                return;
            }else{
                minIndex = leftChildIndex;
            }
        }
        else{
            if(heapArray[leftChildIndex] <= heapArray[rightChildIndex]){
                minIndex = leftChildIndex;
            }else{
                minIndex = rightChildIndex;
            }
        }
        if(heapArray[nodeIndex] > heapArray[minIndex]){
            temp = heapArray[minIndex];
            heapArray[minIndex] = heapArray[nodeIndex];
            heapArray[nodeIndex] = temp;
            heapUp(minIndex);
        }
    }
}
public class HeapDemo {
    public static void main(String[] args) {
        System.out.println("Heap");
    }
}
