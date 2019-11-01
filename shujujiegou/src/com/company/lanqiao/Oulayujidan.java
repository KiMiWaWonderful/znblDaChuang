package com.company.lanqiao;

public class Oulayujidan {

    public static void main(String[] args) {
        for (int i = 0; i <150 ; i++) {
            int x = i;
            int y = 150 - i;
            double priceX = 24.5/y;

            //要写32.0而不是32
            double priceY = 32.0/x;

            if(Math.abs(x * priceX - y * priceY) < 0.000001){
                System.out.println(i +","+(150-i));
            }
            if(x * priceX == y * priceY){
                System.out.println(x+","+y);
            }
        }
    }
}
