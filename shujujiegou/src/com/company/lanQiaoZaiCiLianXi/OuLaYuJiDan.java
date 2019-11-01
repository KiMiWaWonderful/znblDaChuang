package com.company.lanQiaoZaiCiLianXi;

public class OuLaYuJiDan {

    public static void main(String[] args) {
        for (int i = 1; i < 150; i++) {
            int x = i;
            int y = 150-i;

            double priceX = 24.5/y;
            double priceY = 32.0/x;

            double moneyX = x * priceX;
            double moneyY = y * priceY;

            if(Math.abs(moneyX-moneyY) < 0.000001) {
                System.out.println(i+","+(150-i));
                break;
            }
        }
    }
}
