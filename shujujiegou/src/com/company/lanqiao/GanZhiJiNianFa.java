package com.company.lanqiao;

public class GanZhiJiNianFa {
    public static void f(int year){
        char[] x = {'甲','乙','丙','丁','戊','己','庚','辛','壬','癸'};
        char[] y = {'子','丑','寅','卯','辰','巳','午','未','申','酉','戌','亥'};
        int n = year - 1984;
        while(n<0) {
            n += 60;
        }
        System.out.printf("%d %s%s\n",year,x[n%10],y[n%12 ]);
    }
    public static void main(String[] args){
        f(1911);
        f(1970);
        f(2012);
    }

}
