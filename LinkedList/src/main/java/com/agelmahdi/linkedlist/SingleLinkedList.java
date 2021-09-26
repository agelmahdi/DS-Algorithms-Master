package com.agelmahdi.linkedlist;


public class SingleLinkedList {
    public Node head = null;
    public Node tail = null;
    public int size;

    public Node createSLL(int nodeValue){

        head = new Node(); //-----------------> O(1)
        Node node = new Node();//-----------------> O(1)

        node.value = nodeValue; //-----------------> O(1)
        node.next = null; //-----------------> O(1)

        head = node; //-----------------> O(1)
        tail = node; //-----------------> O(1)

        size = 1; //-----------------> O(1)

        return head; //-----------------> O(1)

        //Time Complexity O(1)
        //Space Complexity O(1)


    }

    public void insertInSLL(int nodeValue, int nodeLocation){
        Node node =new Node();
        node.value = nodeValue;
        if (head == null){
            createSLL(nodeValue);//-----------------> O(1)
            return;
        }
        else if(nodeLocation == 0){
            node.next = head;
            head = node;
        }
        else if (nodeLocation >= size){
            node.next = null;
            tail.next = node;
            tail = node;
        }
        else {
            Node temp = head;

            int index = 0 ;

            while (index < nodeLocation -1){ //-----------------> O(n)
                temp = temp.next;
                index++;
            }
            Node nextNode = temp.next;
           // System.out.println("temp : "+temp.value);

            temp.next = node;
            //System.out.println("temp.next : "+temp.next.value);

            node.next = nextNode;
           // System.out.println("temp.next : "+node.next.value);


        }

        size++;

        //Time Complexity O(n)
        //Space Complexity O(1)

    }

    public void deleteItemSLL(int location){

        if (head == null){
            return;
        }
        else if (location == 0){
            head = head.next;

            size--;
            if (size ==0){
                tail=null;
            }
        }
        else if (location >= size ){
            Node temp = head;
            for (int i =0; i< size -1; i++){
                temp= temp.next;
            }
            if (temp==head){
                head = tail =null;
                size--;
                return;
            }
            temp.next =null;
            tail = temp;
            size--;

        }
        else {
            Node current= head;

            for (int i =0; i< location -1;i++){
                current= current.next;
            }

            current.next =current.next.next;
           // System.out.println(current.value);
            size--;


        }
        //Time Complexity O(n)
        //Space Complexity O(1)

    }
    private void deleteEntireSLL(){
        tail=null;
        head =null;
        //Time Complexity O(1)
        //Space Complexity O(1)
    }
    public void traverseSLL(){

        if (head == null){
            System.out.println("Head not found");
        }
        else {
            Node temp = head;
            for (int i =0; i<size; i++){
                System.out.print(temp.value);
                if (i != size -1){
                    System.out.print(" -> ");
                }
                temp = temp.next;
            }
        }
        System.out.println("\n");
        //Time Complexity O(n)
        //Space Complexity O(1)

    }

    public boolean searchSLL(int value){

        if (head == null){
            System.out.println("Head not found");
        }
        else {
            Node temp = head;
            for (int i =0; i<size; i++){
                if (temp.value == value){
                    return true;
                }

                temp = temp.next;
            }
        }
        return false;
        //Time Complexity O(n)
        //Space Complexity O(1)
    }

}
