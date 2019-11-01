package com.company.lanqiao;

public class PaiLieDeGeShu {
    public static int f(int m, int n){
        if(m==0 || n==0) return 1;
        return f(m-1,n)+f(m,n-1); // 填空
    }
    public static void main(String[] args) {
        System.out.println(f(3,2));
    }

}
