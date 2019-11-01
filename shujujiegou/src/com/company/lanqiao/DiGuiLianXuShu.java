package com.company.lanqiao;

public class DiGuiLianXuShu {

    public static void f(int begin, int end) {

        if(begin > end){
            return;
        }
        System.out.println(begin);
        f(begin + 1, end);
    }
    public static void main(String[] args) {
        f(0, 9);
    }

}
