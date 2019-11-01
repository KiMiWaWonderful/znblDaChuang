package com.company.lanqiao;

public class Guoqingxingqiri {

    public static int calc(int n, int m, int d){
        int[][] days = {
                {0,31,28,31,30,31,30,31,31,30,31,30,31},
                {0,31,29,31,30,31,30,31,31,30,31,30,31},
        };
        int b = 0;
        if(n%400 == 0 || n%100 != 0 && n % 4 == 0){
            b = 1;
        }
        int sum = d;
        for (int i = 0; i <m ; i++) {
            sum = sum + days[b][i];
        }
        return sum;
    }

    public static void main(String[] args) {

        int count = 0;
        int total = calc(1949,12,31) - calc(1949,10,2);
        for (int i = 1950; i <2012 ; i++) {
            total = total + calc(i,10,1);
            if(total%7 == 0){
                System.out.println(i+"年10月1日");
                count++;
            }
        }
        System.out.println("总数："+count);
    }
}
