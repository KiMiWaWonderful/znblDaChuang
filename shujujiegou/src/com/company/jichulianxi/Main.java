package com.company.jichulianxi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //输入第一个数
        int n = sc.nextInt();

        //输入数组
        int a[] = new int[n];
        for(int i = 0;i<n; i++){
            a[i] = sc.nextInt();
        }

        //输入与数组某个数相同的数字
        int m = sc.nextInt();
        int x = 0;
        for(int j = 0;j<n;j++){
            if(a[j] == m){
                x = j+1;
                break;
            }
        }

        //输出编号
        if(x>0){
            System.out.print(x);
        }else{
            System.out.print(-1);
        }
    }


}
