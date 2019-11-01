package com.company.lanQiaoZaiCiLianXi;

import java.util.Scanner;

public class MiMaFaShengQi {

   // static int[] data = new int[7];
    public static void  f(String  s,int[] data){
        for (int i = 1; i <= s.length() ; i++) {
            data[i-1] = data[i-1]+(6%i)-1;
        }
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        int[] data = new int[s.length()];
//        f(s,data);
//        for (int i = 0; i <data.length ; i++) {
//            System.out.print(data[i] +" ");
//        }

//        char c = 'a';
//        System.out.println((c-'0'));

       // System.out.println(0%6);

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int[] data = new int[string.length()];

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            data[i % 6 ] = data[i % 6 ] + (c-'0');

        }

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

    }
}
