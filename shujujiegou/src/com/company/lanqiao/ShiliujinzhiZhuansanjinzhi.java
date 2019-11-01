package com.company.lanqiao;

public class ShiliujinzhiZhuansanjinzhi {

    private static int getRealValue(char x)
    {
        if(x>='0' && x<='9') return x-'0';
        if(x>='a' && x<='f') return x-'a'+10;//10开始
        if(x>='A' && x<='F') return x-'A'+10;//10开始
        return 0;
    }
    public static String jin_zhi_16_3(String x)
    {
        int n = 0; // 累加真值
        for(int i=0; i<x.length(); i++)
        {
            n = 16*n + getRealValue(x.charAt(i));  // 填空
        }
        String t = "";
        for(;;)
        {
            if(n==0) break;
            t = (n % 3) + t;
           n = n /3;  // 填空
        }
        return t;
    }

    public static void main(String[] args) {
        //System.out.println(jin_zhi_16_3("12A"));
        //System.out.println(getRealValue('A'));

        int i = 390625;
        String s = i+"";
        s = s.substring(s.length()-3,s.length());
        System.out.println(s);

    }

}
