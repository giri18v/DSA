package com.dsa.LinkedList2;

import java.util.Arrays;
import java.util.List;

public class ReOrderLL {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        ListNode head =MergeNodes.addValues(list);
        reorderList(head);
    }


    public static void reorderList(ListNode head) {

        ListNode p1 = head;
        ListNode p2 = head;

        while(p2.next != null && p2.next.next !=null){
            p1 = p1.next;
            p2= p2.next.next;
        }

        ListNode preMiddle = p1;
        ListNode preCurrent = p1.next;

        while(preCurrent.next != null){
            ListNode current = preCurrent.next;
            preCurrent.next = current.next;
            current.next = preMiddle.next;
            preMiddle.next=current;
        }

        p1 = head;
        p2 =preMiddle.next;
        while(p1 != preMiddle){
            preMiddle.next = p2.next;
            p2.next = p1.next;
            p1.next = p2;
            p1 = p2.next;
            p2 =preMiddle.next;

        }

    }
}
