package com.dsa.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class Unique {


    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};

        System.out.println(numUniqueEmails(emails));

    }

    public static int numUniqueEmails(String[] emails) {

        StringBuilder sb = new StringBuilder();
        HashMap<String,Integer> uniqueMap = new HashMap<String,Integer>();
        for(String str :emails){

            String[] splittedStr = str.split("@");

            String removePlus = splittedStr[0].replaceAll("m","");
            String removeDot = removePlus.replaceAll(".","");
            sb.append(removeDot);
            sb.append("@");
            sb.append(splittedStr[1]);
            if(!uniqueMap.containsKey(sb)){
                uniqueMap.put(sb.toString(),1);
            }
        }
        for(Map.Entry map :uniqueMap.entrySet()){
            System.out.println("Key ::"+map.getKey());
        }
        return uniqueMap.size();

    }
}
