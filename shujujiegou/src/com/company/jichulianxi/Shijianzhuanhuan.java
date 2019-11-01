package com.company.jichulianxi;

import java.util.Scanner;

public class Shijianzhuanhuan {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        //int s = (int) n%60%60;
        int s = (int) n%60;
        int m = (int) ((n/60)%60);
        //int m = (int)(n-3600*h)/60;
        int h = (int) n/3600;

        System.out.print(h+":"+m+":"+s);
    }

}
