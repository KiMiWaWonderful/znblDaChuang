package com.company.lanqiao;

import java.math.BigInteger;

public class Fangmaizi {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("1");
        BigInteger bigInteger1 = new BigInteger("2");

        for (int i = 0; i <64 ; i++) {
            bigInteger = bigInteger.add(bigInteger1.pow(i));
        }

        System.out.println(bigInteger);

//        for (int i = 0; i <64 ; i++) {
//            bigInteger = bigInteger.add(BigInteger.valueOf((long)(Math.pow(2, i))));
//        }
//
//        System.out.println(bigInteger);
    }
}
