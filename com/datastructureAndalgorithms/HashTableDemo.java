package com.datastructureAndalgorithms;

import javax.xml.crypto.Data;

class DataItem{
    private int data;
    private int key;
    public DataItem(int data, int key){
        this.data = data;
        this.key = key;
    }
    public int getData(){
        return data;
    }
    public int getKey(){
        return key;
    }
}
class HashTable{
    private DataItem[] hashtable;
    private int size;
    private DataItem dummyItem;

    public HashTable(int size){
        this.size = size;
        hashtable = new DataItem[size];
        dummyItem = new DataItem(-1,-1);
    }
    public void display(){
        for(int i=0; i<size; i++){
            if(hashtable[i] != null){
                System.out.print("(" + hashtable[i].getKey() + "," +hashtable[i].getData() +")");
            }else {
                System.out.print("~~");
            }
            System.out.println("");
        }
    }
    public int hashcode(int key){
        return key % size;
    }
    public DataItem search(int key){
        int hashIndex = hashcode(key);
        while(hashtable[hashIndex] != null){
            if(hashtable[hashIndex].getKey() == key){
                return hashtable[hashIndex];
            }
            ++hashIndex;
            hashIndex %= size;
        }
        return null;
    }
    public void insert(DataItem item){
        int key = item.getKey();
        int hashIndex = hashcode(key);
        while(hashtable[hashIndex] != null && hashtable[hashIndex].getKey() != -1){
            ++hashIndex;
            hashIndex %= size;
        }
        hashtable[hashIndex] = item;
    }
    public DataItem delete(DataItem item){
        int key = item.getKey();
        int hashindex = hashcode(key);
        while(hashtable[hashindex] != null){
            if(hashtable[hashindex].getKey() == key){
                DataItem temp = hashtable[hashindex];
                hashtable[hashindex] = dummyItem;
                return temp;
            }
            ++hashindex;
            hashindex %= size;
        }
        return null;
    }
}

public class HashTableDemo {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(20);

        hashTable.insert(new DataItem(1, 20));
        hashTable.insert(new DataItem(2, 70));
        hashTable.insert(new DataItem(42, 80));
        hashTable.insert(new DataItem(4, 25));
        hashTable.insert(new DataItem(12, 44));
        hashTable.insert(new DataItem(14, 32));
        hashTable.insert(new DataItem(17, 11));
        hashTable.insert(new DataItem(13, 78));
        hashTable.insert(new DataItem(37, 97));

        hashTable.display();

        DataItem item = hashTable.search(37);

        if(item != null){
            System.out.println("Element found" + item.getData());
        }else{
            System.out.println("Element not found ");
        }
    }
}
