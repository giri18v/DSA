package com.dsa.maths;

public class LastDigitFinder {

    public static void main(String[] args) {
        int n = 8789;
        // i want to get the first digit in a number.
        int lastDigit = 0;
        while (n > 0) {
            lastDigit = n % 10;
            n = n / 10;
        }
        System.out.println(lastDigit);
        int number = 7789;
        int num = (int) (Math.log10(number) + 1);
        System.out.println(num);
    }

}
