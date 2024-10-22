package com.dsa.draftkings;

public class Discounts {
    String name;
    double percentage;

    public Discounts(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Discounts{" +
                "name='" + name + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}
