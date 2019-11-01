package com.company.lanqiao;

import java.util.Scanner;

public class Quqiuboyi {

    public static boolean array[]=new boolean[10020];

    // 按规则取，还剩下n个球时，先取的人能赢吗？
    static boolean f(int n)
    {
        if(n==1) return false;
        if(n>8)return !f(n-8)||!f(n-7)||!f(n-3)||!f(n-1);
        if(n>7)return !f(n-7)||!f(n-3)||!f(n-1);
        if(n>3)return !f(n-3)||!f(n-1);
        else return !f(n-1);
    }


    //    public static void quqiu(int n){
//        boolean[] total = new boolean[n+1];
//        for (int i = 1; i <total.length ; i++) {
//            total[i] = ( i == 1 || i == 3 || i ==7 || i == 8);
//        }
//    }
    public static void main(String[] args) {

        array[0]=true;
        for (int i = 1; i <array.length; i++) {
            array[i] = (i>=8 && !array[i-8]) || (i>=7 && !array[i-7]) || (i>=3 && !array[i-3]) || (i>=1&&!array[i-1]);
        }
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int total;
        scanner.nextLine();
        while ((n--)>0) {
            total = scanner.nextInt();
            System.out.println(array[total] ? 1 : 0);
        }

//            boolean[] total = new boolean[22];//初始全都为false
//        for (int i = 0; i <total.length ; i++) {
//            total[i] = ( i == 1 || i == 3 || i ==7 || i == 8);
//            System.out.print(total[i] + " ");
//        }
 //           total[0] = true;
//        for (int i = 8; i <total.length ; i++) {
//            total[i] = (i>=8&&!total[i-8]);
//            System.out.println(total[i]);
//        }
    }
}
