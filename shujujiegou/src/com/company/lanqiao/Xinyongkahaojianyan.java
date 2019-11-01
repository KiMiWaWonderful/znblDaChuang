package com.company.lanqiao;

import java.util.Scanner;

public class Xinyongkahaojianyan {

    public static boolean jianyan(int[] data){

        int ouSum = 0;
        int jiSum = 0;
        int sum = 0;
        for (int i = data.length-1; i >=0 ; i--) {
            if(data[i] % 2 == 0){
               //int temp = data[i] * 2;
               if(data[i] * 2 > 9){
                   int temp = data[i] * 2 - 9;
                   ouSum = ouSum + temp;
               }else {
                   ouSum = ouSum + data[i] * 2;
               }
            }
            if(data[i] % 2 == 1){
                jiSum = jiSum + data[i];
            }
        }
        sum = ouSum + jiSum;
        if(sum % 10 == 0){
             return true;
        }else {
            return false;
        }
        //return ;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        int [] data = new int[st.length()];
        for (int i = 0; i <st.length() ; i++) {
            data[i] = st.charAt(i) - '0'; //后面要加上- '0'，否则整形数组里存放的是数字的ascii码对应的数值
        }
        System.out.println(jianyan(data));
//        System.out.println(st);
//        System.out.println(data.length);
//        for (int i = 0; i <data.length ; i++) {
//            System.out.print(data[i] + " ");
//        }

    }
}
