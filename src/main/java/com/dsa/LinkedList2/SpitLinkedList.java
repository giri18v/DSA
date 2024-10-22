package com.dsa.LinkedList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpitLinkedList {


    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3);
        ListNode head =MergeNodes.addValues(list);
        splitListToParts(head,5);
    }


    public static ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp = head;
        ListNode[] list = new ListNode[k];
        int length =0;
        List<ListNode> result = new ArrayList<>();
        while(temp != null){
            temp = temp.next;
            length++;
        }
        temp = head;
        if(length < k){
            for(int i=0;i<k;i++){
                if(head != null){
                    list[k] = head;
                    head = head.next;
                }else{
                    list[k] = null;
                }

            }

        }

        return list;

    }
}
