package com.company.lanqiao;

import java.util.Scanner;

public class Shunshizhenluoxuantianru {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] data = new int[n][n];
       int startIndex = 0,endIndex = n-1,e = 0;
       int count = 1;
       while (e <= n/2){
           for (int i = startIndex; i <= endIndex ; i++) {
               data[e][i] = count;
               count++;
           }
           for (int i = startIndex+1; i <= endIndex ; i++) {
               data[i][n-1-e] = count;
               count++;
           }
           for (int i = endIndex-1; i >=startIndex ; i--) {
               data[n-1-e][i] = count;
               count++;
           }
           for (int i = endIndex-1; i >startIndex ; i--) {
               data[i][e] = count;
               count++;
           }
           startIndex++;
           endIndex--;
           e++;
       }

        for (int i = 0; i <data.length ; i++) {
            for (int j = 0; j <data.length ; j++) {
                //采用这种输出方法会输出奇怪的二维数组
                //System.out.print(data[i][j] + " ");

                //可选择这两种输出
                //System.out.printf("%4d",data[i][j] );
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
 //       int [] [] data = new int[4][4];
//        for (int i = 0; i <4 ; i++) {
//            for (int j = 0; j <4 ; j++) {
//                data[i][j] = j+1;
//            }
//        }
//        for (int i = 0; i <4 ; i++) {
//            for (int j = 0; j <4 ; j++) {
//                System.out.print(data[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
