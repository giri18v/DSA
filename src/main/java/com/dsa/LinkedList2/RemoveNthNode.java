package com.dsa.LinkedList2;

import java.util.Stack;

public class RemoveNthNode {


    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = new ListNode(0,head);
        ListNode temp = newHead;

        for(int i=0;i<n;i++){
            head = head.next;
        }
       while(head !=null){
           head = head.next;
           temp = temp.next;
       }

       temp.next = temp.next.next;


        return newHead.next;


    }
}
