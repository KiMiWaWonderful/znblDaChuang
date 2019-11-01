package com.company.lanqiao;

public class ZhaoSuShu {

    public static boolean check(int n){
        for (int i = 2; i*i < n ; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        int n = 1;
        int i = 3;
        while (n<100002){
            if(check(i)){
                n++;
                System.out.println(n+"->" + i);
                i++;
            }else {
                i++;
            }
        }

//        System.out.println(list1.get(100001));
        //System.out.println((int)Math.sqrt(2));
    }
}
