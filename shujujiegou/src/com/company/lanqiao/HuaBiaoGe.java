package com.company.lanqiao;

import java.util.Scanner;

public class HuaBiaoGe {
    public static void show(String [][] s,int[] len){
        StringBuffer stringBuffer = new StringBuffer("+");
        for (int i = 0; i <len.length ; i++) {
            for (int j = 0; j <len[i] ; j++) {
                stringBuffer.append("-");
            }
            stringBuffer.append("+");
        }
        System.out.println(stringBuffer);
        for(String[]x:s){
            for(String y:x){
                System.out.println(y);
            }
            System.out.println("\n"+stringBuffer);
        }
    }

    public static String[][] spiltS(String[] s){
        String[][] t = new String[s.length][];
        for (int i = 0; i <s.length ; i++) {
            t[i] = s[i].split(",");
        }
        return t;
    }

    public static int maxArrLen(String [] s){
        String[][]t = spiltS(s);
        int maxL = 0;
        for(String[] x:t){
            for(String y:x){
                if(y.length() > maxL){
                    maxL = x.length;
                }
            }
        }
        return maxL;
    }

    public static String[][] getArr(String[]s,int n){
        String [][] ss = new String[n][maxArrLen(s)];
        String[][] t = spiltS(s);
        for (int i = 0; i <ss.length ; i++) {
            for (int j = 0; j < ss[i].length; j++) {
                if(j<t[i].length){
                    ss[i][j] = t[i][j];
                }else {
                    ss[i][j] = "";
                }
            }
        }
        return ss;
    }
    
    public static void maxLen(String [][] t,int[] len){
        for (int i = 0; i <len.length ; i++) {
            for (int j = 0; j <t.length ; j++) {
                if(i<t[j].length && t[i][j].length()>len[i]){
                    len[i] = t[j][i].length();
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] strings = new String[n];
        for (int i = 0; i <n ; i++) {
            //不用next()
            strings[i] = scanner.nextLine();
        }
        for (int i = 0; i <strings.length ; i++) {
            System.out.print(strings[i] + " ");
        }

//        String string = scanner.next();
//        String string1 = scanner.next();
//        String string2 = scanner.next();
//        System.out.println(string);
//        System.out.println(string1);
//        System.out.println(string2);
    }
}
