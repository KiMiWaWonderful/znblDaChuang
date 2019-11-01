package com.company.lanqiao;

public class Qiguaidebisai {

    public static void panduan(int[] data){
        int sum = 10;
        for (int i = 0; i <data.length ; i++) {
            if(data[i] == 0){
                sum = sum - (i+1);
            }else if(data[i] == 1){
                sum = sum * 2;
            }
        }

        if(sum == 100){
//            for (int i = 0; i <data.length ; i++) {
//                System.out.print(data[i] + " ");
//            }

            for(int x:data){
                System.out.print(x+" ");
            }
            //System.out.println(sum);
        }
    }
    public static void fun(int[] data ,int n){
        if(n >= data.length){
            panduan(data);
            return;
        }

        data[n] = 0;
        fun(data,n+1);
        data[n] = 1;
        fun(data,n+1);
    }
    public static void main(String[] args) {

        int x[] = new int[10];
        fun(x,0);
    }
}
