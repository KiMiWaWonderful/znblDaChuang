package com.company.lanqiao;

import java.util.Scanner;

public class DaYinHuiXingQianTao {

    public static void oper(char[][] c,int n,int start){
        if(start>=n){
            return;
        }
        //上行
        for (int i = start; i <n ; i++) {
            c[start][i] = '*';
        }
        //最后一行
        for (int i = start; i <n ; i++) {
            c[n-1][i] = '*';
        }
        //最左边
        for (int i = start; i <n ; i++) {
            c[i][start] = '*';
        }
        //最右边
        for (int i = start; i <n ; i++) {
            c[i][n-1] = '*';
        }
        oper(c,n-2,start+2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] c = new char[n][n];

        for (int i = 0; i <c.length ; i++) {
            for (int j = 0; j <c.length ; j++) {
                c[i][j] = ' ';
            }
        }
        oper(c,n,0);
        for(char[] x:c){
            for(char y:x){
                System.out.print(y);
            }
            System.out.println();
        }



    }
}
