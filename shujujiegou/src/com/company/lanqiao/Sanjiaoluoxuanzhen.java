package com.company.lanqiao;

import java.util.Scanner;

public class Sanjiaoluoxuanzhen {

    public static void print(int[][] m){
        for(int[] x:m){
            for(int y:x){
                System.out.printf("%4d",y);
            }
            System.out.println();
        }
    }

    public static void init(int[][] m){
        for (int i = 0; i <m.length ; i++) {
            m[i] = new int[m.length-i];
        }
    }
//
    public static void f(int[][] data, int k, int num){
        if( k >= data.length/2){
            return;
        }
        for (int i = k; i <data[k].length-k ; i++) {
            data[k][i] = num++;
        }
        for (int i = k+1; i <data[k].length-k ; i++) {
            data[i][data[i].length-1-k] = num++;
        }
        for (int i = data[k].length-2-k; i > k ; i--) {
            data[i][k] = num++;
        }
        f(data,k+1,num);
    }

    // 初始化
//    public static void init(int[][] m){
//        for(int i=0;i<m.length;i++){
//            m[i] = new int[m.length-i];
//        }
//    }
//    // 螺旋填充数字
//    public static void f(int[][] m,int k,int num){
//        if(k>=m.length/2) return ;
//        // 第一行
//        for(int i=k;i<m[k].length-k;i++){
//            m[k][i] = num++;
//        }
//        // 最后一位
//        for(int i=k+1;i<m[k].length-k;i++){
//            m[i][m[i].length-1-k] = num++;
//        }
//        // 左列
//        for(int i=m[k].length-2-k;i>k;i--){
//            m[i][k] = num++;
//        }
//        f(m,k+1,num);   // 递归进行内圈填充
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] data = new int[n][];
        init(data);
        f(data,0,1);
      print(data);

//        for (int i = 1;i <=n ; ) {
//            for (int j = 1; j <=n ; j++) {
//                data[i-1][j-1] = j;
//            }
//            break;
//        }
//
//        for (int i = 1; i <n ; i++) {
//            for (int j = n-1; j >= 0 ; j--) {
//                data[i][j] = j;
//            }
//        }
//
//        for (int i = 0; i <data.length ; i++) {
//            for (int j = 0; j <data.length ; j++) {
//                System.out.print(data[i][j] +" ");
//            }
//            System.out.println();
//        }
    }
}
