package com.company.jichulianxi;

import java.util.Scanner;

public class Teshuhuiwenshu {

//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int i,j,k,l,m,n;
//
//        //先判断5位数的
//        for (i=1;i<=9;i++){
//            for (j=1;j<=9;j++){
//                for (k=1;k<=9;k++){
//                    for (l=1;l<=9;l++){
//                        for (m=1;m<=9;m++){
//                           if( x == i+j+k+l+m && i == m && j == l ){
//                               System.out.println(i*10000+j*1000+k*100+l*10+m);
//                           }
//                        }
//                    }
//                }
//            }
//        }
//
//        //再判断6位数的
//        for (i=1;i<=9;i++){
//            for (j=1;j<=9;j++){
//                for (k=1;k<=9;k++){
//                    for (l=1;l<=9;l++){
//                        for (m=1;m<=9;m++){
//                            for (n=1;n<=9;n++){
//                                if( x == i+j+k+l+m+n && i == n && j == m && k == l ){
//                                    System.out.println(i*10000+j*1000+k*100+l*10+m);
//                                }
//                            }
//
//                        }
//                    }
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 10000;i < 100000;i++){
            int a = i/10000;
            int b = i/1000%10;
            int c = i/100%10;
            int d = i/10%10;
            int e = i%10;
            if(a==e && b==d && (a+b+c+d+e)==n)
                System.out.println(i);
        }
        for(int j = 100000;j < 1000000;j++){
            int a = j/100000;
            int b = j/10000%10;
            int c = j/1000%10 ;
            int d = j/100%10;
            int e = j/10%10;
            int f = j%10;
            if(a==f && b==e && c==d && (a+b+c+d+e+f) ==n)
                System.out.println(j);
        }
    }

}
