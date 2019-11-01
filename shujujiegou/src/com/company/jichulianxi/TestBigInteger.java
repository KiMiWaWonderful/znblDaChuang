package com.company.jichulianxi;

import java.math.BigInteger;

public class TestBigInteger {

    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("45");
        BigInteger bi2 = new BigInteger("16");
        System.out.println(bi1.add(bi2)); //加
        System.out.println(bi1.subtract(bi2)); //减
        System.out.println(bi1.multiply(bi2)); //乘
        System.out.println(bi1.divide(bi2));   //除
//计算商和余数并通过数组返回
        BigInteger[] arr = bi1.divideAndRemainder(bi2);
//使用for循环打印数组中的每个元素
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
