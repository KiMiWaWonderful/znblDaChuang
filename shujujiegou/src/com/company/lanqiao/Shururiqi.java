package com.company.lanqiao;

import java.util.Scanner;

public class Shururiqi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String string2  = " ";//这样string2的首个为空字符
       // System.out.println(string);
        String[] string1 = string.split("-");
//        for (int i = 0; i <string1.length ; i++) {
//            System.out.print(string1[i] + " ");
//        }
//        System.out.println();
        if(string1[1].length() == 1){
            String temp = "0" + string1[1];
            string1[1] = temp;
        }
        if(string1[2].length() == 1){
            String temp = "0" + string1[2];
            string1[2] = temp;
        }
        for (int i = 0; i <string1.length ; i++) {
            string2 = string2 + string1[i];
        }
        String string3 = string2.substring(1,string2.length());
//        for (int i = 0; i <string1.length ; i++) {
//            System.out.print(string1[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i <string2.length() ; i++) {
//            System.out.print(string2.charAt(i) + " ");
//        }
//        System.out.println();
//        for (int i = 0; i <string3.length() ; i++) {
//            System.out.print(string3.charAt(i) + " ");
//        }
//        System.out.println();
        int n = Integer.parseInt(string3);
       // System.out.println(n);
        System.out.println(n-19491001);
    }
}
