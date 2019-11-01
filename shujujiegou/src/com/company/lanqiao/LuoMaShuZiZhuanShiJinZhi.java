package com.company.lanqiao;

public class LuoMaShuZiZhuanShiJinZhi {

    public static int getNum(char c){

        switch (c){
            case 'I':
                return 4;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
    public static void main(String[] args) {

    }
}
