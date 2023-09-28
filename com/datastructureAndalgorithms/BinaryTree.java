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
                    current = current.rightNode;
                }
                if(current == null){
                    return null;
                }
            }
        }
        return current;
    }
    public void insert(int data){
        Node1 node = new Node1();
        node.data = data;

        if(root == null){
            root = node;
        }else{
            Node1 current = root;
            Node1 parent = null;

            while(true){
                parent = current;
                if(data < parent.data){
                    current = current.leftNode;
                    if(current == null){
                        parent.leftNode = node;
                        return;
                    }
                    else{
                        current = current.rightNode;
                        if(current == null){
                            parent.rightNode = node;
                            return;
                        }
                    }
                }
            }
        }
    }
    public void traverse(int traversalType){
        switch (traversalType){
            case 1:
                System.out.println("\nPreorder traversal:");
                preorder(root);
                break;
            case 2:
                System.out.println("\nInorder traversal:");
                inorder(root);
                break;
            case 3:
                System.out.println("\nPostorder traversal:");
                postorder(root);
                break;
        }
    }
    private void preorder(Node1 root){
        if(root != null){
            System.out.println(root.data +" ");
            preorder(root.leftNode);
            preorder(root.rightNode);
        }
    }
    private void inorder(Node1 root){
        if(root != null){
            inorder(root.leftNode);
            System.out.println(root.data +" ");
            inorder(root.rightNode);
        }
    }
    private void postorder(Node1 root){
        postorder(root.leftNode);
        postorder(root.rightNode);
        System.out.println(root.data +" ");
    }
}
public class BinaryTree {
    public static void main(String[] args) {
        Btree tree = new Btree();

        tree.insert(8);
        tree.insert(5);
        tree.insert(3);
        tree.insert(1);
        tree.insert(4);
        tree.insert(2);

        Node1 node = tree.search(1);
        if(node != null){
            System.out.print("Element Found");
            node.result();
            System.out.println();
        }else{
            System.out.println("Element Not Found");
        }

        Node1 node1 = tree.search(2);
        if(node1 != null){
            System.out.print("Element Found");
            node1.result();
            System.out.println();
        }else{
            System.out.println("Element Not Found");
        }
        tree.traverse(1);
        tree.traverse(2);
        tree.traverse(3);
    }
}
