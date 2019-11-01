package com.company.lanqiao;

import java.util.Scanner;

public class Yundongyuanfenzu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int g = (n + 7)/8;
        if(g > 8){
            g = 8;
        }

        int num = n/g;
        int r = n%g;
        for (int i = 0; i <r ; i++) {
            System.out.println(num + 1);
        }
        for (int i = 0; i <g-r ; i++) {
            System.out.println(num);
        }
    }
}
