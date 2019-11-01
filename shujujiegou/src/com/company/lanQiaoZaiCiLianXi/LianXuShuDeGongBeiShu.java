package com.company.lanQiaoZaiCiLianXi;

import java.math.BigInteger;

public class LianXuShuDeGongBeiShu {

    public static BigInteger f(int n)
    {
        int[] x = new int[n+1];
        for(int i=1; i<=n; i++) x[i] = i;
        for(int i=2; i<n; i++)
        {
            for(int j=i+1; j<=n; j++)
            {
                if(x[j] % x[i]==0)
                   x[j] = x[j] / x[i] ;   // 填空1
            }
        }
        BigInteger m = BigInteger.ONE;
        for(int i=2; i<=n; i++)
        {
            m = m.multiply(BigInteger.valueOf(x[i]));   // 填空2
        }
        return m;
    }
    public static void main(String[] args)
    {
        System.out.println(f(30));
    }

}
