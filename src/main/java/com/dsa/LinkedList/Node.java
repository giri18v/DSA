package com.dsa.LinkedList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node {

     int value;
     Node next;

    public Node(int value){
        this.value =value;
    }



}
