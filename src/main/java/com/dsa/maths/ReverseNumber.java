package com.dsa.maths;

public class ReverseNumber {


    public static void main(String[] args) {
        int result = reverse(7789);
        System.out.println(result);
        int result2 = reverse2(7789);
        System.out.println(result2);

    }

    public static int reverse(int num) {
        int reverse = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num = num / 10;
        }
        return reverse;
    }

    public static int reverse2(int num) {
        String reverse = "";
        while (num > 0) {
            int lastDigit = num % 10;
          reverse = reverse+lastDigit;
            num = num / 10;
        }
        return Integer.parseInt(reverse);
    }

}
