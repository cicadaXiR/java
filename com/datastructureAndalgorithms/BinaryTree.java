package com.datastructureAndalgorithms;

class Node1 {
    public int data;
    public Node1 rightNode;
    public Node1 leftNode;
    public Node1(){
    }
    public void result(){
        System.out.println("(" + data +")");
    }
}
class Btree{
    private Node1 root;
    public Btree(){
        root = null;
    }
    public Node1 search(int data){
        Node1 current = root;
        System.out.println("Visiting elements:");
        while(current.data != data){
            if(current != null){
                System.out.println(current.data+ " ");
                if(current.data > data){
                    current = current.leftNode;
                }else{
                    current = current.rightNode
                }
                if(current == null){
                    return null;
                }
            }
        }
        return current;
    }
}
public class BinaryTree {
    public static void main(String[] args) {

    }
}
