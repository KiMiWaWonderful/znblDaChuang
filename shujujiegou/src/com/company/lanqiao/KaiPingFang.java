package com.company.lanqiao;

public class KaiPingFang {

    public static void main(String[] args) {
        double n = 2;
        double a = 0;
        double b = n;
        while(Math.abs((a-b))>1E-15){
            a = (a+b)/2;
           b=n/a;
        }
        System.out.printf("%f\n", a);
        System.out.println(Math.sqrt(n));
    }

}
