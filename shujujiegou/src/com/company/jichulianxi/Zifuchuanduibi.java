package com.company.jichulianxi;

import java.util.Scanner;

public class Zifuchuanduibi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        if( str1.length() != str2.length()){
            System.out.println("1");
        }else if( str1.length() == str2.length() && str1.equals(str2)){
            System.out.println("2");
        }else if (str1.length() == str2.length() && str1.equalsIgnoreCase(str2)){
            System.out.println("3");
        }else if(str1.length() == str2.length() && !(str1.equals(str2))){
            System.out.println("4");
        }
    }
}
