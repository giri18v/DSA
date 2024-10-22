package com.dsa.LinkedList2;

import java.util.Arrays;
import java.util.List;

public class PartitionList {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        ListNode head =MergeNodes.addValues(list);
        partition(head,3);
    }



    public static ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(0,head);
        ListNode dummy2 = new ListNode(0,head);
        ListNode temp = head;
        ListNode left = dummy1;
        ListNode right = dummy2;

        while(temp != null){
            if(temp.val < x){
                left=left.next;
            }else {
                right = right.next;
            }
            temp = temp.next;

        }

        left.next = right;

        return dummy1.next;



    }
}
