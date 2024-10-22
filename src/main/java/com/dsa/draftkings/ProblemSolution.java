package com.dsa.draftkings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class ProblemSolution {

    public static void main(String[] args) {

        List<Customer> customerList = Arrays.asList(

                new Customer("A", 2000.0),
                new Customer("B", 2500),
                new Customer("C", 3000),
                new Customer("D", 1500),
                new Customer("E", 3500)
        );

        List<Discounts> discountsList = Arrays.asList(

                new Discounts("Discount1", 10),
                new Discounts("Discount2", 15),
                new Discounts("Discount3", 5),
                new Discounts("Discount4", 12),
                new Discounts("Discount5", 8),
                new Discounts("Discount5", 3),
                new Discounts("Discount5", 2)
        );

        oneDiscountForOneCustomers(customerList, discountsList);
        oneDiscountForManyCustomers(customerList,discountsList);



    }

    private static void oneDiscountForOneCustomers(List<Customer> customerList, List<Discounts> discountsList) {
        // Sort customer spending descending.
        //NLogN
        customerList.sort((c1, c2) -> Double.compare(c2.yearlySpending, c1.yearlySpending));
        //MLogM
        PriorityQueue<Discounts> discountsPriorityQueue = new PriorityQueue<>((d1,d2) -> Double.compare(d2.percentage, d1.percentage));
        discountsPriorityQueue.addAll(discountsList);

        //MNogN times
        while(!discountsPriorityQueue.isEmpty()) {
            Discounts discount = discountsPriorityQueue.poll();
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

    private static void oneDiscountForManyCustomers(List<Customer> customerList, List<Discounts> discountsList) {
        // Sort customer spending descending.
        //NLogN
        customerList.sort((c1, c2) -> Double.compare(c2.yearlySpending, c1.yearlySpending));
        //MLogM
        PriorityQueue<Discounts> discountsPriorityQueue = new PriorityQueue<>((d1,d2) -> Double.compare(d2.percentage, d1.percentage));
        discountsPriorityQueue.addAll(discountsList);

        HashMap<Discounts,Boolean> assignedValue = new HashMap<>();
        for(Discounts discounts : discountsList){
            assignedValue.put(discounts,false);
        }

        for(Discounts discount : discountsList){
            for(Customer customer: customerList){
                if(customer.canAddDiscount(discount)){
                    customer.addDiscount(discount);
                    assignedValue.put(discount,true);
                    break;
                }
            }

        }

        //MNogN times
        while(!discountsPriorityQueue.isEmpty()) {
            Discounts discount = discountsPriorityQueue.poll();
            for(Customer customer : customerList){
                if(!assignedValue.get(discount) || customer.canAddDiscount(discount)){
                    customer.addDiscount(discount);
                    assignedValue.put(discount,true);
                    break;
                }
            }
        }

        for(Customer customer : customerList){
            System.out.println(customer);
        }
    }


}
