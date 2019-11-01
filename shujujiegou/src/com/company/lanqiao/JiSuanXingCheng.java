package com.company.lanqiao;

public class JiSuanXingCheng {

    public static double getDistance(int begin, int end, double d){
        return ((end - begin) * Math.PI * d)/1000;
    }
    public static void main(String[] args) {
        System.out.println(getDistance(0,1000,1)+"公里");
       // System.out.println(2.1/10);
    }

}
