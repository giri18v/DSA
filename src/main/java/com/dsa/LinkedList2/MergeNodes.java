package com.dsa.LinkedList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeNodes {

    public static void main(String[] args) {
            List<Integer> values = Arrays.asList(0,3,1,0,4,5,2,0);
            ListNode head = addValues(values);
        ListNode result =mergeNodes(head);
        ListNode result2 =mergeNodesWithLessComplexity(head);
        System.out.println(result);
    }


    public static ListNode addValues(List<Integer> list) {
        ListNode dummy = new ListNode(0);
        ListNode iterator = dummy;

        for(int num : list) {
            iterator.next = new ListNode(num);
            iterator =iterator.next;
        }

        return dummy.next;

    }

    // TC - O(N)
    //SC - O(N)
    // But we need to reduce the space complexity to O(1)
    public static ListNode mergeNodes(ListNode head) {

        head = head.next;
        ListNode temp = new ListNode(0);
        ListNode iter = temp;
        int count = 0;
        while(head != null){

            if(head.val == 0){
            count = count+ head.val;
            ListNode node = new ListNode(count);
            iter.next = node;
            iter = iter.next;
            count =0;
            }else {
                count = count+ head.val;
            }

            head = head.next;
        }
        return temp.next;
    }

    public static ListNode mergeNodesWithLessComplexity(ListNode head) {
        ListNode newHead = head;
        ListNode temp = head;
        head = head.next;

        int count = 0;
        while(head != null){

            if(head.val == 0){
                count = count+ head.val;
               temp.val = count;
               if(head.next != null){
                   temp.next = head;
                   temp = temp.next;
               }else {
                   temp.next = null;
                   break;
               }
                count =0;
            }else {
                count = count+ head.val;
            }
            head = head.next;
        }




        return newHead;
    }
}
