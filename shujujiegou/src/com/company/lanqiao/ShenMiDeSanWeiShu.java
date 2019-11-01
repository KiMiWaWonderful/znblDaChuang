package com.company.lanqiao;

public class ShenMiDeSanWeiShu {

    public static void main(String[] args) {
        int JC[] = { 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880 }; // 0~9的阶乘
        int i;
        for (i = 100; i < 1000; i++) {
            int sum = 0;
            int x = i;
            while (x > 0) {
               sum = sum + JC[x%10];
                x /= 10;
            }
            if (i == sum)
                System.out.printf("%d\n", i);
        }
    }

}
