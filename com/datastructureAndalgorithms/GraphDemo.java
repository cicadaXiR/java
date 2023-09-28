package com.datastructureAndalgorithms;

class MyStack{
    private int size;
    private int[] stackArray;
    private int top;

    public MyStack(int size){
        this.size = size;
        stackArray = new int[size];
        top = -1;
    }
    public void push(int data){
        if(!isFull()){
            stackArray[++top] = data;
        }else {
            System.out.println("Stack is empty");
        }
    }
    public int pop(){
        return stackArray[top--];
    }
    public boolean isFull(){
        return(top == size - 1);
    }
    public boolean isEmpty(){
        return(top == -1);
    }
    public int peek(){
        return stackArray[top];
    }
}
class MyQueue{
    private int size;
    private int[] QueueArray;
    private int front;
    private int rear;
    private int item;

    public MyQueue(int size){
        this.size = size;
        QueueArray = new int[size];
        front = 0;
        rear = -1;
        item = 0;
    }
    public void insert(int data){
        if(!isFull()){
            if(rear == size-1){
                rear = -1;
            }
            QueueArray[++rear] = data;
            ++item;
        }
    }
    public int remove(){
        int data = QueueArray[front++];
        if(front == size){
            front = 0;
        }
        item--;
        return data;
    }
    public boolean isFull(){
        return item == size;
    }
    public boolean isEmpty(){
        return item == 0;
    }
    public int peek(){
        return QueueArray[front];
    }
    public int size(){
        return item;
    }
}
public class GraphDemo {
    public static void main(String[] args) {

    }
}
