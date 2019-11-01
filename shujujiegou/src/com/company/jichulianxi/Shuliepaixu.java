package com.company.jichulianxi;

import com.company.shuzu.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Shuliepaixu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i<n ; i++){
            a[i] = sc.nextInt();
        }

        //排序
//        for(int pass = n-1;pass>=0;pass--){
//            for(int i = 0;i<pass-1;i++){
//                if(a[i] > a[i+1]){
//                    int temp = a[i];
//                    a[i] = a[i+1];
//                    a[i+1] = temp;
//                }
//            }
//        }

        Arrays.sort(a);

        //输出数组
        for(int i = 0;i<n;i++){
            System.out.print(" "+a[i]+" ");
        }
    }

}
