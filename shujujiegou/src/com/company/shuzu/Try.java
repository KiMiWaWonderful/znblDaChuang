package com.company.shuzu;

public class Try {

    public static void main(String[] args) {
       // boolean b = ((20>45) ? (true:false));

        boolean c = 20>45?true:false;
        System.out.println(c);

        int a = 10;
        int b = 20;
        String s = a>b?"a>b":"a<b";
        System.out.println(s);
//        int max = (a>b?a:b);
//        System.out.println(max);
        int max = (20>10 ? 20:10);
        System.out.println(max);
        //System.out.println(b);
    }
}
