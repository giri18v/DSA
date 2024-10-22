package com.dsa.draftkings;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    String name;
    double yearlySpending;

    List<Discounts> discountsList;

    public Customer(String name, double yearlySpending) {
        this.name = name;
        this.yearlySpending = yearlySpending;
        this.discountsList = new ArrayList<>();
    }

   public double totalPercentage(){
       return discountsList.stream().mapToDouble(d1 -> d1.percentage).sum();
   }

   public boolean canAddDiscount(Discounts discount){
        if(discountsList.size() > 3){
            return false;
        }
        if(totalPercentage() + discount.percentage > 20){
            return false;
        }
        return true;
   }

    public void addDiscount(Discounts discount) {
        if(canAddDiscount(discount)){
            discountsList.add(discount);
        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getYearlySpending() {
        return yearlySpending;
    }

    public void setYearlySpending(double yearlySpending) {
        this.yearlySpending = yearlySpending;
    }

    public List<Discounts> getDiscountsList() {
        return discountsList;
    }

    public void setDiscountsList(List<Discounts> discountsList) {
        this.discountsList = discountsList;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", yearlySpending=" + yearlySpending +
                ", discountsList=" + discountsList +
                '}';
    }
}
