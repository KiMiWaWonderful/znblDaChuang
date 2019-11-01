package com.company.lanqiao;

public class Quzimuzuchengchuan {

    public static int g(int n){
        if(n == 1){
            return 1;
        }
        return 3 * g(n-1) + f(n-1);
    }

    public static int f(int n){
        if(n == 1){
            return 3;
        }
        return 3 * f(n-1) + g(n - 1);
    }
    public static void main(String[] args) {

        System.out.println(f(5));
    }
}
