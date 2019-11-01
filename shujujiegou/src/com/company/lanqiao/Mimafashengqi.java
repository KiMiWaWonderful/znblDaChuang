package com.company.lanqiao;

import java.util.Scanner;

public class Mimafashengqi {

    public static int sim(int n){
        String s = null;
        while (n>=10){
            s = n+"";
            n = 0;
            for (int i = 0; i <s.length() ; i++) {
                n = n+s.charAt(i) - '0';//这样可以把char转换成int
            }
        }
        return n;

    }

    public static void main(String[] args) {
        String  s = null;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        while (n > 0){
            int array[] = new int[6];
            s = scanner.nextLine();
            for (int i = 0; i <s.length() ; i++) {
                array[i%6] =  array[i%6]+s.charAt(i);
            }

            for (int i = 0; i < 6; i++) {
                System.out.print(sim(array[i]));
            }
            n--;

        }

//        String s = "wangximing";
//        int n = 0;;
//        for (int i = 0; i < s.length(); i++) {
//            n = n+s.charAt(i) ;
//        }
//        System.out.println(n);
        
//        String s = "wangximing";
//        for (int i = 0; i < s.length(); i++) {
//            System.out.println(0+s.charAt(i));//这样输出ascii码
//        }
//        String string = scanner.nextLine();
//        String string1 = string.substring(0,6);
//        String string2 = string.substring(6,string.length());
//
//        int a0,a1,a2,a3,a4,a5 = 0;
      //  a1 = string1[0] +
//        System.out.println(string);
//        System.out.println(string1);
//        System.out.println(string2);
    }
}
