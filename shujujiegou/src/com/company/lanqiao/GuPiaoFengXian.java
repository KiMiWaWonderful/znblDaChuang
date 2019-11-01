package com.company.lanqiao;

public class GuPiaoFengXian {

    public static void main(String[] args) {
        int N = 10000;
        int n = 0;
        for (int i = 0; i < N; i++) {
            double value = 1000.0;
            for (int k = 0; k < 100; k++) {

                if(Math.random() > 0.5)
                    value = value * 1.1;
                else
                    value = value * 0.9;
            }
            if(value>1000)
                n++;
        }
        System.out.println(1.0 * n / N);
    }

}
