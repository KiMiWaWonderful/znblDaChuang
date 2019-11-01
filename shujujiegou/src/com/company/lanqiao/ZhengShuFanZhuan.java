package com.company.lanqiao;

public class ZhengShuFanZhuan {

    public static void main(String[] args){
        int n = 1234;
        int m = 0;
        while(n>0){
           //m= Integer.parseInt((m+"")+(n%10+""));
            m=m*10+n%10;
            n = n / 10;
        }
        System.out.println(m);
    }

}
