package com.company.jichulianxi;

import java.util.Scanner;

public class Fenjiezhiyinshu {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int start=reader.nextInt();
        int end=reader.nextInt();
        for(int i=start;i<=end;i++){
            System.out.println(i+"="+fun(i).substring(1));
        }
    }

    static String fun(int n){
        String str="";
        for(int i=2;i<n;i++){
            if(n%i==0){
                return "*"+str+i+fun(n/i);
            }
        }
        return "*"+n;

    }
}
