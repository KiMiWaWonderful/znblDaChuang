package com.company.jichulianxi;

import java.util.Scanner;

public class Sanjiaoxing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //输入n行
        int n = sc.nextInt();

        int a[][] = new int[1000][1000];

        //为杨辉三角形赋值
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                if(j == 0 || i == j){
                    a[i][j] = 1;
                }else{
                    a[i][j] = a[i-1][j-1] + a[i-1][j];
                }
            }
        }

        //输出杨辉三角形
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
