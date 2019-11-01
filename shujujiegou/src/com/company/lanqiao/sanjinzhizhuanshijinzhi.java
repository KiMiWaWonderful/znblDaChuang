package com.company.lanqiao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sanjinzhizhuanshijinzhi {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = 0;
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c<'0' || c > '2') throw new RuntimeException("Format error");
          //  n = (int) (n + ((c - '0') * Math.pow(3,(s.length()-1)-i)));
           n =  3*n+c-'0';
        }
        System.out.println(n);

    }
}
