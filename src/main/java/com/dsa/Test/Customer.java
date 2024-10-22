package com.dsa.Test;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private double yearSpending;

    private List<Discount> discountList;

    public Customer(String name,double yearSpending){
        this.name = name;
        this.yearSpending = yearSpending;
        this.discountList = new ArrayList<>();
    }

    public double totalSpending(){
        return discountList.stream().mapToDouble(Discount::getDiscount).sum();
    }

    public boolean canAddDiscount(Discount discount){
        if(discountList.size() > 3) return false;
        if(totalSpending() +discount.getDiscount() > 20) return false;
        return true;
    }

    public void addDiscount(Discount discount){
        if(canAddDiscount(discount)){
            discountList.add(discount);
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", yearSpending=" + yearSpending +
                ", discountList=" + discountList +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getYearSpending() {
        return yearSpending;
    }

    public void setYearSpending(double yearSpending) {
        this.yearSpending = yearSpending;
    }

    public List<Discount> getDiscountList() {
        return discountList;
    }

    public void setDiscountList(List<Discount> discountList) {
        this.discountList = discountList;
    }
}
