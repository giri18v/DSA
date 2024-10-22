package com.dsa.LinkedList2;

import java.util.Arrays;
import java.util.List;

public class MergeSortedList {


    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,4);
        List<Integer> list2 = Arrays.asList(1,3,4);
        ListNode head1 = addValues(list);
      //  insertEnd(head1,10);
        ListNode head2 = addValues(list2);
        mergeTwoLists(head1,head2);

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

    public static ListNode insertEnd(ListNode head ,int val){
        ListNode tail = new ListNode(val);

        ListNode iterator = head;

        while(iterator.next !=null) {

            iterator =iterator.next;
        }
        iterator.next = tail;
        return head;

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode iterator = dummy;

        while(list1 != null && list2 != null){

            if(list1.val <=list2.val) {
                iterator.next = list1;
                list1 =list1.next;
                iterator =iterator.next;
            }else {
                iterator.next = list2;
                list2 = list2.next;
                iterator = iterator.next;
            }
        }
        if(list1 != null) {
            iterator.next = list1;
        }else if(list2 != null){
            iterator.next = list2;
        }

        return dummy.next;
    }

    public void deleteNode(ListNode node) {



    }
}
