package com.company.lanqiao;

public class PaiQiYouXi {

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if(i % 7 == 0)
                System.out.printf("*\n");
            else if(i % 10 == 7 || i /10 == 7)
                System.out.printf("*\n");
            else
                System.out.printf("%d\n", i);
        }
    }

}
