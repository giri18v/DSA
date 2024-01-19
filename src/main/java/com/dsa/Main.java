package com.dsa;

import com.dsa.LinkedList.LinkedList;

public class Main {
    public static void main(String[] args) {


        LinkedList linkedList = new LinkedList(4);
        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();
        linkedList.append(8);

        System.out.println("\nAdded Index:"+linkedList.prependFirstIndex(1).getValue());

        System.out.println("\nAdded Index:"+linkedList.prependFirstIndex(5).getValue());

        linkedList.getHead();
        linkedList.getTail();

        linkedList.getLength();

        System.out.println("\nGet Index Value:"+linkedList.getIndexValue(2).getValue());

        //5,1,4,8

        System.out.println("\nSet Index Value:"+linkedList.setIndexValue(1,2).getValue());

        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();

        System.out.println("\nRemoved First Index:"+linkedList.removeFirstIndex().getValue());

        linkedList.getLength();

        System.out.println("\nRemoved Index:"+linkedList.removeLastIndex().getValue());
        System.out.println("\nRemoved Index:"+linkedList.removeLastIndex().getValue());
        System.out.println("\nRemoved Index:"+linkedList.removeLastIndex());

        System.out.println("\nLinked List:");
        linkedList.printList();

        int a = 10;
        String str ="q";
     //  System.out.println( getLastDigit("3","10"));


    }




}