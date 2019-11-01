package com.company.lanqiao;

public class Yuanzhoulvyujishu {

    public static void main(String[] args) {
        double y = 1;
        double x = 1;
        int a = 1;
        int b = 3;
        while (y > 1e-15){
            y = y*(a/b);
            x = x + y;
            a++;
            b = b+2;
        }
        System.out.println(x*2);
    }

}
