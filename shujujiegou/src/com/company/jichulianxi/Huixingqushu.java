package com.company.jichulianxi;

import java.util.Scanner;

public class Huixingqushu {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//        int b[][] = new int[n][m];
//
//        //输入矩阵
//        for (int i = 0; i <n ; i++) {
//            for (int j = 0; j <m ; j++) {
//                b[i][j] = sc.nextInt();
//            }
//        }
//
//        //输出第一列
//        for (int i = 0; i <n ; i++) {
//            System.out.print(b[i][0]+" ");
//        }
//        System.out.println();
//
//        //输出最后一行
////        for (int i = 0; i <m ; i++) {
////            System.out.print(a[n-1][i] +" ");
////        }
////        System.out.println();
//
//        //边界数组，题目没有指明是正整数
////        for (int i = 0;i <= m + 1; i ++){
////            b[i][0] = true;
////            b[i][n + 1] = true;
////        }
////
////        for (i = 0; i <= n + 1; i ++){
////            b[0][i] = b[m + 1][i] = true;
////        }
//
//
//        //回形取数
//        //记录总数
//        int count = 0;
//        //当前点的上一个点
//        int tmpI = 0,tmpJ = 0;
//        //方向
//        int direction = 1;
//
//        //起点
//        int i = 0;
//        int j = 1;
//        while (count < m * n) {
//            switch (direction % 4) {
//                case 1:
//                    i++;
//                    break;
//                case 2:
//                    j++;
//                    break;
//                case 3:
//                    i--;
//                    break;
//                case 0:
//                    j--;
//                    break;
//            }
//            //当走到边界的时候还原上一步
//            if(b[i][j]){
//                direction ++;
//                i = tmpI;
//                j = tmpJ;
//                continue;
//            }
//            System.out.print(b[i][j] + " ");
//            tmpI = i;
//            tmpJ = j;
//            count ++;
//            //b[i][j] = true;
//        }
//
//    }

    public static void main(String[] args) {
        //初始化
        int m, n;
        int i, j;
        int[][] a = new int[250][250];
        Scanner scanner = new Scanner(System.in);
        boolean [][] b = new boolean[250][250];

        m = scanner.nextInt();
        n = scanner.nextInt();

        for (i = 1; i <= m; i++) {
            for (j = 1; j <= n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        //边界数组，题目没有指明是正整数
        for (i = 0;i <= m + 1; i ++){
            b[i][0] = true;
            b[i][n + 1] = true;
        }

        for (i = 0; i <= n + 1; i ++){
            b[0][i] = b[m + 1][i] = true;
        }


        //回形取数
        //记录总数
        int count = 0;
        //当前点的上一个点
        int tmpI = 0,tmpJ = 0;
        //方向
        int direction = 1;

        //起点
        i = 0;
        j = 1;
        while (count < m * n) {
            switch (direction % 4) {
                case 1:
                    i++;
                    break;
                case 2:
                    j++;
                    break;
                case 3:
                    i--;
                    break;
                case 0:
                    j--;
                    break;
            }
            //当走到边界的时候还原上一步
            if(b[i][j]){
                direction ++;
                i = tmpI;
                j = tmpJ;
                continue;
            }
            System.out.print(a[i][j] + " ");
            tmpI = i;
            tmpJ = j;
            count ++;
            b[i][j] = true;
        }
    }
}
