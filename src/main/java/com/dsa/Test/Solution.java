package com.dsa.Test;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {


    public static void main(String[] args) {

        List<Customer> customerList = Arrays.asList(
                new Customer("A" ,3000) ,
                new Customer("B",3500) ,
                new Customer("C" , 2500) ,
                new Customer("D" , 2000) ,
                new Customer("E" , 4000)
        );


        List<Discount> discountList = Arrays.asList(
                new Discount("Discount1" , 10) ,
                new Discount("Discount2" , 20) ,
                new Discount("Discount3" , 5) ,
                new Discount("Discount4", 2)
        );

        addDiscounts(customerList,discountList);

    }


    public static void addDiscounts(List<Customer> customerList , List<Discount> discountList){

        customerList.sort((c1,c2) -> Double.compare(c2.getYearSpending() ,c1.getYearSpending()));

        PriorityQueue<Discount> discountPriorityQueue = new PriorityQueue<>((d1,d2) -> Double.compare(d2.getDiscount(),d1.getDiscount()));
        discountPriorityQueue.addAll(discountList);

        while(!discountPriorityQueue.isEmpty()){
            Discount discount = discountPriorityQueue.poll();

            for(Customer customer : customerList){
                if(customer.canAddDiscount(discount)){
                    customer.addDiscount(discount);
                    break;
                }
            }
        }

        for(Customer customer : customerList){
            System.out.println(customer);
        }

    }


}
