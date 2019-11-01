package com.company.lanqiao;

public class ZuiXiaoGongBeiShu {

    public static int f(int a, int b)
    {
        int i;
        for(i=a;;i=i+a){ // 填空
            if(i%b==0)
                return i;
        }
    }

    public static void main(String[] args){
        System.out.println(f(6,8));
    }

}
