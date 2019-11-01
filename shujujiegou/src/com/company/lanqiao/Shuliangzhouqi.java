package com.company.lanqiao;

public class Shuliangzhouqi {

    static int count = 100;
    static void shu(double x , double r){
        if(count <= 0){
            return;
        }
        //int count = 100;
        x = x * (1-x) * r;
        System.out.println(x);
        count--;
        shu(x,r);

       // for (int i = 0; i <100 ; i++) {

       // }

    }
    public static void main(String[] args) {
        double x = 0.2;
        double r = 0.32;

        for (int i = 0; i <=100 ; i++) {
            x = x * (1-x) * r;
            System.out.println(x);
        }

        shu(x,r);
        //System.out.println(x);


    }
}
