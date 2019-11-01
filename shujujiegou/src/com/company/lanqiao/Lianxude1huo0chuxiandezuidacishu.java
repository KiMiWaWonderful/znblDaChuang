package com.company.lanqiao;

public class Lianxude1huo0chuxiandezuidacishu {

    public static int getMaxContinuity(String s)
    {
        int max_1 = 0;
        int max_0 = 0;
        int n_1 = 0;  // 当前1连续的次数
        int n_0 = 0;  // 当前0连续的次数
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='0')
            {
                n_0++;
                n_1 = 0;

               // continue;
            }
            else
            {
                n_1++;
                n_0 = 0;

               // continue;
            }
            if(n_1 > max_1){
                max_1 = n_1;
            }
            if(n_0 > max_0)
                max_0 = n_0;
        }
        return (max_1>max_0? max_1 : max_0);
    }

    public static void main(String[] args) {

        System.out.println(getMaxContinuity("0111100000"));

    }
}
