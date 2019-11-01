package com.company.lanqiao;

public class ZuHeShu {

    // n 个元素中任取 m 个元素，有多少种取法
    public static int f(int n, int m){
        if(m>n) return 0;
        if(m==0) return 1;

        return f(n-1,m-1)+f(n-1,m); // 填空
    }
    public static void main(String[] args){
        System.out.println(f(4,2));
    }

}
