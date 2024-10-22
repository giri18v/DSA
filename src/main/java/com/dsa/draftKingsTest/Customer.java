package com.dsa.draftKingsTest;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private Integer customerId;
    private String name;
    private float yearSpending;

    public Customer(Integer customerId, String name, float yearSpending) {
        this.customerId = customerId;
        this.name = name;
        this.yearSpending = yearSpending;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", yearSpending=" + yearSpending +
                '}';
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getYearSpending() {
        return yearSpending;
    }

    public void setYearSpending(float yearSpending) {
        this.yearSpending = yearSpending;
    }
}
