package com.company.lanqiao;

import java.util.Scanner;

public class Jiaogubushu {

    static int count = 0;
    public  static void jiaogu(int n){
//        if( n == 1){
//            System.out.println(count);
//            return;
//        }
//        if(n % 2 == 0){
//            n = n / 2;
//            count  = count + 1;
//        }else if(n % 2 == 1){
//            n = n * 3 + 1;
//            count  = count + 1;
//        }
//
//        jiaogu(n,count);

//        for (int i = 1;  ; i++) {
//            if(i == 1){
//                System.out.println(0);
//                break;
//            }
//            int  c = i;
//            while (i != 1){
//                if(i % 2 == 0){
//                    i = i / 2;
//                    count = count + 1;
//                }else if(i % 2 == 1){
//                    i = i * 3 + 1;
//                    count = count + 1;
//                }
//            }
//            if(count == n){
//                System.out.println(c);
//                count = 0;
//                break;
//            }
//
//        }

        if(n <= 1){
            return;
        }
        count = count + 1;

        if(n % 2 == 0){
            jiaogu(n/2);
        }else {
            jiaogu(n*3 + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        while (true){

            //不是i++
            jiaogu(++i);

            if(count == n){
                System.out.println(i);
                break;
            }
            count = 0;

        }

    }
}
