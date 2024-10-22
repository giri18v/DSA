package com.dsa.LinkedList2;

import java.util.Arrays;
import java.util.List;

public class IntersectionofTwoNodes {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,1,8,4,5);
        List<Integer> list2 = Arrays.asList(5,6,1,8,4,5);
        ListNode head1 = addValues(list);
        ListNode head2 = addValues(list2);
        getInterSectionNode2(head1,head2);

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

    public static ListNode getInterSectionNode2(ListNode headA,ListNode headB){
        int countA = count(headA);
        int countB = count(headB);
        //Making HeadA is bigger always
        if(countB > countA){
            ListNode temp = headA;
            headA =headB;
            headB = temp;
            int temp1 = countA;
            countA =countB;
            countB = temp1;
        }
        //Equalising Both are at Same node
        while(countA > countB){
                headA = headA.next;
                countA = countA-1;
        }
        while(headA != headB){

            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA = count(headA);
        int countB = count(headB);
        if(countB > countA){

            ListNode temp = headA;
            headA =headB;
            headB = temp;
            int temp1 = countA;
            countA =countB;
            countB = temp1;
        }

        while(countA > countB){
            headA = headA.next;
            countA = countA-1;
        }
        while(headA.val != headB.val){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

    public static void swap(ListNode headA,ListNode headB){
        ListNode temp = headA;
        headA =headB;
        headB = temp;

    }

    public static void swap(int countA,int countB){
        int temp = countA;
        countA =countB;
        countB = temp;

    }
    public static int count(ListNode head){
        ListNode temp = head;
        int count=0;
        while(temp.next !=null){
            count+=1;
            temp =temp.next;
        }
        return count;

    }
}
