package com.company.lanqiao;

import java.util.Scanner;

public class SiFangDingLi {

    public static int f(int n, int a[], int idx) {
        if(n == 0) // 填空1
            return 1;
        if (idx == 4)
            return 0;

        for (int i = (int) Math.sqrt(n); i >= 1; i--) {
            a[idx] = i;

            if ( f(n-i*i, a, idx+1) == 1)// 填空2
                return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (;;) {
            int number;
            System.out.printf("输入整数(1~10亿)：");
            number = scan.nextInt();
            int a[] = { 0, 0, 0, 0 };
            int r = f(number, a, 0);
            System.out.printf("%s: %d %d %d %d\n", r==1?"有结果":"无结果", a[0], a[1], a[2], a[3]);
        }
    }

}
