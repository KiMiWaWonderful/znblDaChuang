package com.company.lanQiaoZaiCiLianXi;

public class LuanShengSuShu {

    public static boolean isPrime(int x){
        for(int i=2; i<=x/2; i++){
            if(x%i==0)
                return false;//填空
        }
        return true;
    }
    // 是否是孪生素数
    public static int twinPrimeNum(int n){
        int sum = 0;
        for(int i=2; i<n; i++){
            if( isPrime(i) && isPrime(i+1))
                sum=sum+1;//填空
        }

        return sum; // 返回个数
    }
    public static void main(String[] args){
        int n = 1000;
        System.out.println(twinPrimeNum(n));
    }
}
