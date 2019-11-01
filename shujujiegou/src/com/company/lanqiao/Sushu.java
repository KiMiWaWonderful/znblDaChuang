package com.company.lanqiao;

public class Sushu {

    public static void main(String[] args) {
        int n = 1000*1000*10;
        int x = 100001;

        byte[] a= new byte[n];

        for (int i = 2; i <n/2 ; i++) {
           if(a[i] == 1){
               continue;
           }
            for (int j = 2; j <=n/i ; j++) {
                if(i*j<n){
                    a[i*j] = 1;
                }
            }
        }
        
        int m = 0;
        for (int i = 2; i <n ; i++) {
            if(a[i] == 0){
                m++;
                if(m == x){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
