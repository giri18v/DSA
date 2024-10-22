package com.dsa.maths;

public class ArmStrongNumber {


    public static void main(String[] args) {
        System.out.println(isArmStrongNumber(1634));
    }


    public static boolean isArmStrongNumber(int num) {
       int noOfTimes = String.valueOf(num).length();
        int sum = 0;
        int temp=num;
        while (num > 0) {
            int lastDigit = num % 10;
            sum+= Math.pow(lastDigit,noOfTimes);
            num = num / 10;
        }
        return temp == sum;
    }
}
