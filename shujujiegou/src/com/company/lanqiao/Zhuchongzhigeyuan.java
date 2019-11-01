package com.company.lanqiao;

public class Zhuchongzhigeyuan {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        double r = 1;
        int n = 6;
        for (int i = 0; i <10 ; i++) {
            double h = Math.sqrt(1-(r/2)*(r/2));
            r = Math.sqrt((r/2)*(r/2)+(1-h)*(1-h));
            n = n * 2;
            System.out.println((n*r)/2);
        }
    }
}
