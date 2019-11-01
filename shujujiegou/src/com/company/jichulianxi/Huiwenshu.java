package com.company.jichulianxi;

public class Huiwenshu {

//    public static void main(String[] args) {
//
//        int i,j,k,l;
//
//        for(i = 1;i<=9;i++){
//            for(j = 0;j<=9;j++){
//                for(k = 0;k<=9;k++){
//                    for(l = 0;l<=9;l++){
//                        if( i==l && j==k){
//                            System.out.println(i*1000+j*100+k*10+l);
//                        }
//                    }
//                }
//            }
//        }
//    }

    public static void main(String[] args){
        for(int i = 1000; i < 10000;i++){
            int a = i/1000;
            int b = i/100%10;
            int c = i/10%10;
            int d = i%10;
            if(a == d && b == c)
                System.out.println(i);
        }
    }

}
