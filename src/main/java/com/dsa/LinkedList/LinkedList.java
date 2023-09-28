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




}
