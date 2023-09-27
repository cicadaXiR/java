package com.datastructureAndalgorithms;

class Node1 {
    int data;
    Node1 right;
    Node1 left;

    public Node1(int data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }
}
class Btree{
        int index = -1;
        public Node1 buildTree(int node[]){
            index++;
            if(node[index] == -1){
                return null;
            }
            Node1 newNode = new Node1(node[index]);
            newNode.right = buildTree(node);
            newNode.left = buildTree(node);
            return newNode;
        }
    }

public class BinaryTree {
    public static void main(String[] args) {
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        Btree tree = new Btree();
        Node1 root = tree.buildTree(node);
        System.out.println(root.data);
    }
}
