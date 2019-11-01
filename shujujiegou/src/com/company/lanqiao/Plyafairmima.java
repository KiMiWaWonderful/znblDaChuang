package com.company.lanqiao;

import java.util.ArrayList;
import java.util.Scanner;

public class Plyafairmima {

    public static char initArray(char [][]array,String s){
        ArrayList<Character> list = new ArrayList<>();
        for (char i = 'a'; i <='z' ; i++) {
            list.add(i);
        }
        for (int i = 0; i <s.length() ; i++) {
            list.remove((Character)s.charAt(i));
            array[i/5][i%5] = s.charAt(i);
        }
        for (int i = 0,j=s.length(); i <list.size()-1 ; i++) {
            array[j/5][j%5] = list.get(i);
        }
        return list.get(list.size()-1);
    }

//    public static String passwordAfterChange(char[][] array,String password,char unUsedch){
//        StringBuffer stringBuffer = new StringBuffer();
//        for (int i = 0; i <password.length() ; i+=2) {
//
//        }
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

       // System.out.println(s);
        ArrayList<Character> list = new ArrayList<>();
        for (char i = 'a'; i <='z' ; i++) {
             list.add(i);
        }
        int[][]data = new int[list.size()][list.size()];
        for (int i = 0; i <s.length() ; i++) {
            list.remove((Character)s.charAt(i));
            data[i/5][i%5] = list.get(i);
        }
        for (int i = 0,j=s.length(); i <list.size()-1 ; i++) {
            data[j/5][j%5] = list.get(i);
        }
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        for (int i = 0; i <data.length ; i++) {
            for (int j = 0; j <data.length ; j++) {
                //System.out.print(data[i][j] + "\t ");
                System.out.printf("%4d",data[i][j]);
            }
            System.out.println();
        };



    }
}
