package com.dsa.geeksForGeeks;

import java.math.BigDecimal;
import java.math.BigInteger;

public class FindLastDigitOfANumber {


    public static void main(String[] args) {


        String a ="3";
        String b ="10";
        int n = 1;

        System.out.println(new BigInteger(a).modPow(new BigInteger(b),BigInteger.TEN).intValue());

    }

}
