package com.company.lanqiao;

public class Hanzixiangcheng {

    public static void main(String[] args) {
        for (int a = 0; a <= 9 ; a++) {
            for (int b = 0; b <= 9 ; b++) {
                for (int c = 0; c <= 9 ; c++) {
                    for (int d = 0; d <= 9 ; d++) {
                        for (int e = 0; e <= 9 ; e++) {
                            if(a != b && a != c && a != d && a != e && b != c && b != d && b != e && c != d &&c != e && d != e ){
                                    int left = (a * 100 + b * 10 + c) * (d * 10 + a);
                                    int right = b * 1000 + c * 100 + d * 10 + e;
                                    if(right == left){
                                        System.out.println((a * 100 + b * 10 + c) +"*"+ (d * 10 + a) +"=" + (b * 10 + c) + "+" + (d * 10 + e) );
                                    }
                            }
                        }
                    }
                }
            }
        }
    }
}
