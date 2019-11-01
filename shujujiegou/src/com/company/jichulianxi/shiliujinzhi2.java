package com.company.jichulianxi;

import java.util.Scanner;

public class shiliujinzhi2 {

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String str = input.next();
//        double out = 0;
//        int m = 0;
//        for(int i = 0;i < str.length();i++){
//            char k = str.charAt(i);
//
//            //0~9对应48~57，A~F对应65~70,
//            if((int)k >= 65)
//                m = (int)k -65 + 10;
//            else
//                m = (int)(k)- 48;
//            out = m * Math.pow(16, str.length()-i-1)+out;
//        }
//
//        System.out.println((long)out);
//    }

//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        while(input.hasNext()){
//            String str = input.nextLine();
//            System.out.println(Long.parseLong(str,16));
//        }
//    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.next();
        // System.out.print(Long.valueOf(str,16));
        System.out.println(Long.parseLong(str,16));
    }
}
