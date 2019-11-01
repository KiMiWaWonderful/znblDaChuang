package com.company.jichulianxi;

public class Teshu {

//    public static void main(String[] args) {
//
//        int i,j,k;
//        for(i = 1;i<9;i++){
//            for(j = 0;j<9;j++){
//                for(k = 0;k<9;k++){
//                    if((i*100+j*10+k) == (i*i*i+j*j*j+k*k*k)){
//                        System.out.println(i*100+j*10+k);
//                    }
//                }
//            }
//        }
//    }

    public static void main(String[] args){
        for(int i = 100;i < 1000;i++){
            int k = i%10;
            int t = i/10%10;
            int h = i/100;
            int sum = h*h*h + t*t*t + k*k*k;
            if(i == sum){
                System.out.println(i);
            }
        }
    }
}
