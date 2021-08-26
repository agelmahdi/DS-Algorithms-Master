package com.agelmahdi.queuearray;

public class CircularQueue {
    int queue[] = null;
    int start;
    int top;
    int size;

    public CircularQueue(int size){
        queue =new int[size];
        top = -1;
        start = -1;
        this.size = size;
    }

    public void enQueue(int value){
        if (isFull()){
            System.out.println("queue is full");
        }
        else if (isEmpty()){
            start= 0;
            top ++;
            queue[top] = value;

            System.out.println("Queued: "+ value + " Position: "+ top);
        }
        else {
            if (top +1 == size){
                top =0;
            }
            else {
                top++;
            }
            queue[top] = value;
            System.out.println("Queued: "+ value + " Position: "+ top);

        }

    }
    public boolean isFull(){
        if (top +1 ==start ) return true;
        else return start == 0 && top + 1 == size;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public int deQueue(){
        if (isEmpty()){
            throw new IllegalArgumentException("Queue is full");
        }else{
            int value = queue[top];
            queue[start] = Integer.MIN_VALUE;
            if (start == top){
                top =start = -1;
            }
            else if (start +1 == size){
                start=0;
            }
            else {
                start++;
            }
            return value;
        }
    }
    public int peek(){
        if (isEmpty()){
            throw new IllegalArgumentException("Queue is empty");
        }
        else {
            return queue[top];
        }

    }


}
