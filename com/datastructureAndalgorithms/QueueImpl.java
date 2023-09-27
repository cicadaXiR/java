package com.datastructureAndalgorithms;
class Queue{
    private int maxSize;
    private int queueArray[];
    private int front;
    private int rear;
    private int currentSize;
    public Queue(int size){
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
    }

    public void enqueue(int value){
        if(isFull()){
            System.out.println("The Queue is full");
            return;
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = value;
        currentSize++;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("The Queue is Empty");
            return -1;
        }
        front = (front + 1) % maxSize;
        currentSize--;
        return queueArray[front];
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("The Queue is Empty");
            return -1;
        }
        return queueArray[front];
    }
    public boolean isFull(){
        return currentSize == maxSize;
    }
    public boolean isEmpty(){
        return currentSize == 0;
    }
}
public class QueueImpl {
    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.enqueue(10);
        queue.enqueue(30);
        queue.enqueue(20);

        System.out.println(queue.peek());
        System.out.println("Deleted Element from queue:" +queue.dequeue());
        System.out.println(queue.isEmpty());
    }
}
