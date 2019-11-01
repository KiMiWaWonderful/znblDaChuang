package com.company.lanqiao;

public class YinShuFenJie {

    public static void f(int n) {
        for (int i = 2; i < n / 2; i++) {
            while(n % i == 0){
                System.out.printf("%d ", i);
                n = n / i;
            }
        }
        if (n > 1)
            System.out.printf("%d\n", n);
    }
    public static void main(String[] args) {
        f(60);
    }

}
