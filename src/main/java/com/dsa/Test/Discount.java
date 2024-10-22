package com.dsa.Test;

public class Discount {

    private String name;

    private float discount;

    public Discount(String name , float discount) {
        this.name = name;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Discount{" +
                "name='" + name + '\'' +
                ", discount=" + discount +
                '}';
    }

    public String getName(){
       return name;
   }

   public String setName(String name){
       return this.name = name;
   }

   public double getDiscount(){
       return discount;
   }

   public double setDiscount(float discount){
       return this.discount = discount;
   }


}
