package com.datastructureAndalgorithms;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class MyList{
        Node head;
        public MyList(){
            head = null;
        }
        public void insertData(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        public void display(){
            Node current = head;
            while(current != null){
                System.out.println(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
public class LinkedList {
    public static void main(String[] args) {
        MyList list = new MyList();

        list.insertData(10);
        list.insertData(20);
        list.insertData(30);
        list.insertData(40);
        list.insertData(50);

        System.out.println("LinkedList : ");
        list.display();
    }
}
