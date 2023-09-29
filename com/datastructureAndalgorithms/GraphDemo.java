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
class Vertex{
    public char label;
    public boolean visited;
    public Vertex(char label){
        this.label = label;
        visited = false;
    }
}
class Graph{
    private final int Max = 20;
    private Vertex lstArray[];
    private int adjArray[][];
    private int vertexCount;
    private MyStack stack;
    private MyQueue queue;

    public Graph(){
        lstArray = new Vertex[Max];
        adjArray = new int[Max][Max];
        vertexCount = 0;
        stack = new MyStack(Max);
        queue = new MyQueue(Max);
        for(int i=0; i<Max;i++){
            for (int j=0; j<Max; j++){
                adjArray[i][j] = 0;
            }
        }
    }
    public void addVertex(char label){
        lstArray[vertexCount++] = new Vertex(label);
    }
    public void addEdges(int start, int end){
        adjArray[start][end] = 1;
        adjArray[end][start] = 1;
    }
    public void displayVertex(int vertexIndex){
        System.out.println(lstArray[vertexIndex].label+" ");
    }
    public int getAdjUnVisitedVertex(int vertexIndex) {
        for (int i = 0; i < vertexCount; i++) {
            if (adjArray[vertexIndex][i] == 1 && lstArray[i].visited == false) {
                return i;
            }
        }
        return -1;
    }
    public void depthSearchFirst(){
        lstArray[0].visited = true;
        displayVertex(0);
        stack.push(0);

        while(!stack.isEmpty()){
            int unvisitedVertex = getAdjUnVisitedVertex(stack.peek());
            if(unvisitedVertex == -1){
                stack.pop();
            }else{
                lstArray[unvisitedVertex].visited = true;
                displayVertex(unvisitedVertex);
                stack.push(unvisitedVertex);
            }
            for(int i=0; i<vertexCount; i++){
                lstArray[i].visited = false;
            }
        }
    }
    public void breadthFirstSearch(){
        lstArray[0].visited = true;
        displayVertex(0);
        queue.insert(0);

        int unvisitedVertex;
        while(!queue.isEmpty()){
            int tempVertex = queue.remove();
            while((unvisitedVertex = getAdjUnVisitedVertex(tempVertex)) != -1){
                lstArray[unvisitedVertex].visited = true;
                displayVertex(unvisitedVertex);
                queue.insert(unvisitedVertex);
            }
            for(int i=0; i<vertexCount;i++){
                lstArray[i].visited = false;
            }
        }
    }
}
public class GraphDemo {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');
        graph.addVertex('G');

        graph.addEdges(0,1);
        graph.addEdges(1,2);
        graph.addEdges(2,3);
        graph.addEdges(0,4);
        graph.addEdges(0,5);
        graph.addEdges(5,6);

        System.out.print("Depth First Search :");
        graph.breadthFirstSearch();
        System.out.println("");
        System.out.print("Breadth First Search :");
        graph.breadthFirstSearch();
    }
}
