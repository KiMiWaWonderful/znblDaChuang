package com.company.lanqiao;

public class JinZiTa {

    public static void h(int space, char x){
        int i;
        if(x<'A' || x>'Z') return;
           h(space+1, (char) (x-1));// 填空
        for(i=0; i<space; i++) System.out.printf(" ");
        for(i=0; i<x-'A'; i++) System.out.printf("%c",'A'+i);
       for(i=0; i<=x-'A'; i++) System.out.printf("%c",x-i); // 填空
        System.out.printf("\n");
    }
    public static void main(String[] args) {
        int space=2;
        char x= 'E';
        h(space,x);
    }

}
