package com.dsa.draftKingsTest;

public class Discount {

    private Integer discountID;
    private String name;
    private float amount;


    public Discount(Integer discountID, String name, float amount) {
        this.discountID = discountID;
        this.name = name;
        this.amount = amount;
    }

    public Integer getDiscountID() {
        return discountID;
    }

    public void setDiscountID(Integer discountID) {
        this.discountID = discountID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Discount{" +
                "discountID=" + discountID +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
