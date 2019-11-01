package com.company.lanqiao;

import java.util.ArrayList;

public class Zhenghliumiantiranse {

    public static int sum = 0;

    public static void f(){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int x1 = 1; x1 <=4 ; x1++) {
            for (int x2 = 1; x2 <=4 ; x2++) {
                for (int x3 = 1; x3 <=4 ; x3++) {
                    for (int x4 = 1; x4 <=4 ; x4++) {
                        for (int x5 = 1; x5 <=4 ; x5++) {
                            for (int x6 = 1; x6 <=4 ; x6++) {
                                arr.add(x1*100000 + x2*10000 + x3*1000 + x4*100 + x5*10 + x6);
                            }
                        }
                    }
                }
            }
        }

        for (int x1 = 1; x1 <=4 ; x1++) {
            for (int x2 = 1; x2 <=4 ; x2++) {
                for (int x3 = 1; x3 <=4 ; x3++) {
                    for (int x4 = 1; x4 <=4 ; x4++) {
                        for (int x5 = 1; x5 <=4 ; x5++) {
                            for (int x6 = 1; x6 <=4 ; x6++) {
                                if(arr.contains(x1*100000 + x2*10000 + x3*1000 + x4*100 + x5*10 + x6)){
                                    sum++;
                                    arr.remove(new Integer(x1*100000 + x2*10000 + x3*1000 + x4*100 + x5*10 + x6));
                                    up(x4,x1,x3,x6,x5,x2,arr);
                                    left(x5,x2,x1,x4,x6,x3,arr);
                                    rotate(x1,x5,x2,x3,x4,x6,arr);

                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }

    public static void up(int x1, int x2, int x3, int x4, int x5, int x6, ArrayList<Integer> arr){
        if(arr.remove(new Integer(x1*100000 + x2*10000 + x3*1000 + x4*100 + x5*10 + x6))){
            up(x4,x1,x3,x6,x5,x2,arr);
            left(x5,x2,x1,x4,x6,x3,arr);
            rotate(x1,x5,x2,x3,x4,x6,arr);
        }else {
            return;
        }
    }

    public static void left(int x1, int x2, int x3, int x4, int x5, int x6, ArrayList<Integer> arr){
        if(arr.remove(new Integer(x1*100000 + x2*10000 + x3*1000 + x4*100 + x5*10 + x6))){
            up(x4,x1,x3,x6,x5,x2,arr);
            left(x5,x2,x1,x4,x6,x3,arr);
            rotate(x1,x5,x2,x3,x4,x6,arr);
        }else {
            return;
        }
    }

    public static void rotate(int x1, int x2, int x3, int x4, int x5, int x6, ArrayList<Integer> arr){
        if(arr.remove(new Integer(x1*100000 + x2*10000 + x3*1000 + x4*100 + x5*10 + x6))){
            up(x4,x1,x3,x6,x5,x2,arr);
            left(x5,x2,x1,x4,x6,x3,arr);
            rotate(x1,x5,x2,x3,x4,x6,arr);
        }else {
            return;
        }
    }
    public static void main(String[] args) {

        f();
    }
}
