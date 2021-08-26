package com.agelmahdi.queuelinkedlist;

public class Queue {
    private LinkedList queue;
    private int start;
    private int top;


    public Queue(){
        queue = new LinkedList();
    }

    public void enQueue(int value){
        queue.insert(value);
    }

    public int deQueue(){
        if (isEmpty()){
            throw new NullPointerException("Queue is empty");
        }

        int value = queue.head.value;
        queue.head = queue.head.next;

        queue.size--;
        return value;
    }

    public int peek(){
        if (isEmpty()){
            throw new NullPointerException("Queue is empty");
        }
        return queue.head.value;
    }
    public void traverse(){
        Node node = queue.head;
        for (int i = 0; i<queue.size;i++){
            System.out.print(node.value);
            if (i != queue.size -1){
                System.out.print(" <- ");
            }
            node= node.next;
        }
        System.out.println("\n");
    }
    private boolean isEmpty(){
        return queue.head == null;
    }
}
