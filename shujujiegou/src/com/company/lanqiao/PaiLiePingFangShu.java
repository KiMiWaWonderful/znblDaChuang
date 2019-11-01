package com.company.lanqiao;

public class PaiLiePingFangShu {
    public static void f(int[] a, int n) {
        if (n == a.length - 1) {
            int k = 0; // 把a里的数字组合为一个数字k
            for(int i=0; i<a.length; i++)
                k = k * 10 + a[i];
            int m = (int) (Math.sqrt(k)+0.5);
            if (m * m == k) {
                System.out.println(k);
            }
            return;
        }
        // 全排列
        for (int i = n; i < a.length; i++) {
            int t = a[n];
            a[n] = a[i];
            a[i] = t;

            f(a,n+1);

            t = a[n];
            a[n] = a[i];
            a[i] = t;
        }
    }
    public static void main(String[] args) {
        int[] a = { 1, 9, 6 };
        f(a, 0);
    }

}
