package com.dsa.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmail {


    public static void main(String[] args) {

        String[] emails ={"test.email+alex@leetcode.com", "test.email@leetcode.com"};

        System.out.println(numUniqueEmails(emails));
    }

    public static int numUniqueEmails(String[] emails) {

        Set<String> uniqueAddress = new HashSet<>();

        for(String email :emails){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<email.length();i++){
                if(email.charAt(i) == '.'){
                    continue;
                }else if(email.charAt(i) == '+'){
                    while(email.charAt(i) != '@'){
                        i++;
                    }
                    sb.append(email.substring(i));
                    break;
                }else {
                    sb.append(email.charAt(i));
                }
            }
            uniqueAddress.add(sb.toString());

        }
        return uniqueAddress.size();

    }
}
