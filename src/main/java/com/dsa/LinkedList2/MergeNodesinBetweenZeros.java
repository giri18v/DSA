package com.dsa.LinkedList2;

import java.util.Arrays;
import java.util.List;

public class MergeNodesinBetweenZeros {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0,3,1,0,4,5,2,0);
        ListNode head1 = addValues(list);

        mergeNodes(head1);

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

    public static ListNode mergeNodes(ListNode head) {

        ListNode temp = new ListNode(0);
        ListNode iter = temp;
        head = head.next;
        int count =0;
        while(head !=null){
            count = count+head.val;
            if(head.val == 0){
               ListNode node = new ListNode(count);
               iter.next = node;
               iter = iter.next;
                count =0;
            }
            head = head.next;
        }

        return temp.next;
    }

}
