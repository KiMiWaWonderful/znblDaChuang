package com.company.lanqiao;

import java.math.BigInteger;

public class Lianxushudegongbeishu {

    public static BigInteger f(int n)
    {
        int[] x = new int[n+1];
        for(int i=1; i<=n; i++) x[i] = i;
        for(int i=2; i<n; i++)
        {
            for(int j=i+1; j<=n; j++)
            {
                //去除后面存在的多余因子
                if(x[j] % x[i]==0){
                    x[j] = x[j] / x[i];

                }
            }
        }
        BigInteger m = BigInteger.ONE;
        for(int i=2; i<=n; i++)
        {
            m = m.multiply(BigInteger.valueOf(x[i]));
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.println(f(10));
    }

}
