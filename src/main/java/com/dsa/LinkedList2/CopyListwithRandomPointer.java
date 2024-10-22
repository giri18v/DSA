package com.dsa.LinkedList2;

import java.util.HashMap;
import java.util.Map;

public class CopyListwithRandomPointer {

    public static void main(String[] args) {

    }

    public Node copyRandomList(Node head) {
        Node temp = head;
        Map<Node,Node> nodeMap = new HashMap<>();
        Node result = new Node(0);

        while(temp != null){
            Node node = new Node(temp.val);
            nodeMap.put(temp,node);
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            Node node = nodeMap.get(temp);
            node.next = temp.next;
            node.random = temp.random;
            result.next = node;
            result = result.next;
            temp = temp.next;
        }

        return result.next;

    }

    public Node copyRandomList2(Node head) {
        if(head == null){
            return null;
        }
        Node temp = head;

        while(temp != null){
            Node node = new Node(temp.val);
            node.next = temp.next;
            temp.next = node;
            temp = node.next;
        }
        temp = head;

        while(temp != null){
            if(temp.random != null){
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }

        Node head2 = new Node(0);
        Node temp2 = head2;
        temp = head;
        while(temp != null){
            Node fast = temp.next.next;
            temp2.next = temp.next;
            temp.next = fast;
            temp = fast;
            temp2 = temp2.next;

        }
        return head2.next;
    }

}
