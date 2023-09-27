package com.datastructureAndalgorithms;
class Mystack{
    private int maxsize;
    private int StackArray[];
    private int top;

    public Mystack(int size){
        this.maxsize = size;
        this.StackArray = new int[maxsize];
        this.top = -1;
    }
    public void push(int value){
        if(isFull()) {
            System.out.println("The stack is full" +value);
            return;
        }
        StackArray[++top] = value;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("The Stack is empty");
            return -1;
        }
        return StackArray[top--];
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("The Stack is empty");
            return -1;
        }
        return StackArray[top];
    }
    public boolean isFull(){
        return top == maxsize-1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
}
public class Stack {
    public static void main(String[] args) {
        Mystack stack = new Mystack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("peek"+stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
       // System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}
