package com.company.lanqiao;

public class BianLiangJiaoHuan {

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println("a="+a+"\nb="+b);
    }

}
