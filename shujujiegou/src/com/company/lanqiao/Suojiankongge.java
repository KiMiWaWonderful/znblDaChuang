package com.company.lanqiao;

public class Suojiankongge {

    public static void main(String[] args) {
        String s = "aa     cc dd";
        //2种缩减空格的办法，一种是得到String,另一种是String[]
//        String test = s.replaceAll("\\s{1}"," ");
//        System.out.println(test);
//        s = test;
        String[] str = s.split("[\\s]+ ");
        for (int i = 0; i <str.length ; i++) {
            System.out.print(str[i] + " ");
        }
    }
}
