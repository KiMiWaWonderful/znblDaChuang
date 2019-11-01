package com.company.lanqiao;

public class Weishengwuzengzhi {

    public static int zengzhi(int x,int y,int t){

        for (int i = 1; i <=t ; i++) {
             y = y - x;//?
            if(i % 3 == 0){
                x = x * 2;
            }
            if(i % 2 == 0){
                y = y * 2;
            }
        }
        return y;
    }
    public static void main(String[] args) {

        System.out.println(zengzhi(10,89,60));
        System.out.println(zengzhi(10,90,60));
    }

}
