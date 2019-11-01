package com.company.jichulianxi;

import java.util.Scanner;

public class Shiliujinzhi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        //除以16后的余数
        int k = 0;

        //十六进制里有字母
        char m;

        //要返回的字符串
        String str = "";

        //0要单独讨论
        if (a == 0)
            str = "0";

        while(a%16 != 0 || a/16 != 0){
           //a除以16的余数
            k= a%16;

            //判断是否大于10
            if(k/10 == 1)
                m = (char)(65 + k%10);
            else
                m = (char)(48 + k);
            str = m + str;
            a = a / 16;
        }
        System.out.println(str);
    }
}
