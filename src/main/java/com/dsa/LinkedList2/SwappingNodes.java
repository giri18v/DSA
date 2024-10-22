package com.dsa.LinkedList2;

public class SwappingNodes {

    public static void main(String[] args) {

    }


    public ListNode swapNodes(ListNode head, int k) {

        ListNode node1 = head;

        for (int i = 0; i < k; i++) {
            node1 =node1.next;
        }

        ListNode temp = node1;
        ListNode node2 =head;

        while (temp.next !=null){
            node2 = node2.next;
            temp = temp.next;
        }
        temp.val = node1.val;
        node1.val = node2.val;
        node2.val=temp.val;

        return head;
    }

}
