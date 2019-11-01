package com.company.lanqiao;

import java.util.Scanner;

public class Zifupaixu {


    static void Quan(char[] data ,int k){
        if(k == data.length){
            for (int i = 0; i <data.length ; i++) {
                System.out.print(data[i]+" ");

            }
            System.out.println();
        }
        for (int i = k; i <data.length ; i++) {
            {
                char t = data[k];
                data[k] = data[i];
                data[i] = t;
            }
            Quan(data,k+1);

            {
                char t = data[k];
                data[k] = data[i];
                data[i] = t;
            }
        }


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // char[] d = new char[1024*10];
        String  s = null;
       // for (int i = 0; i <d.length ; i++) {
           s = scanner.next();
        //}
        char[] dd = s.toCharArray();
        //char []data = {'a','b','c'};
        Quan(dd,0);
    }
}
