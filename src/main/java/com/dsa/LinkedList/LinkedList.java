package com.dsa.LinkedList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LinkedList {


    private Node head;
    private Node tail;

    private int length;

    private int value;

    public LinkedList(int value){
        Node node = new Node(value);
        this.head = node;
        this.tail =head;
        length = 1;
        this.value =value;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = head;
        }else{
            tail.next=newNode;
            tail = newNode;
        }
        length++;
        System.out.println("Appended new Node and length is:: "+ length);
        System.out.println("Head Value is:: "+ head.value);
        System.out.println("Tail value  is:: "+ tail.value);

        String[] strs = new String[4];

        String s = strs[0].substring(0,2);

        char ch ='g';

        if(s.equals(strs[0])){

        }

    }

    public Node removeLastIndex(){

        if(length ==0){
            head =null;
            tail = null;
        }else{
            Node temp =head;
            Node pre = head;
            while(temp.next != null){
            pre =temp;
            temp = temp.next;
            }
            tail = pre;
            tail.next = null;
            length --;
            return temp;
        }
        return null;
    }

    public Node prependFirstIndex(int value){
        Node newNode = new Node(value);
        if(length ==0){
            head = newNode;
            tail = newNode;
            tail.next=null;
        }else{
            newNode.next = head;
            head = newNode;
            length++;
        }
        return head;
    }

    public Node removeFirstIndex(){
        if(length==0){
            head =null;
            tail=null;
        }else{
            Node temp =head;
            head =head.next;
            temp.next=null;
            length--;
            return temp;
        }
        return null;
    }

    public Node getIndexValue(int index){
        Node temp = head;
        for(int i=0;i<length;i++){
           if(index == i){
               return temp;
           }else{
               temp=temp.next;

           }
       }
        return null;
    }


    public Node setIndexValue(int index,int value){
        Node temp = head;
        for(int i=0;i<length;i++){
            if(index == i){
                temp.value = value;
                return temp;
            }else {
                temp =temp.next;
            }
        }
        return null;

    }

}
