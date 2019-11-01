package com.company.leetcode;

import java.util.Scanner;

public class Zimuyiweici2 {

    public static  boolean isAnagram(String s, String t) {


//
        if(s.length() != t.length()){
            return false;
        }

//        char[] sc = s.toCharArray();
//        char[] tc = t.toCharArray();
//        Arrays.sort(sc);
//        Arrays.sort(tc);
//
//        for (int i = 0; i <sc.length ; i++) {
//            if(sc[i] != tc[i]){
//                return false;
//            }
//        }
//        return true;

        int [] chars = new int[26];

        for (char c:s.toCharArray()) {
            chars[c-'a']++;
        }

        for (char c:t.toCharArray()) {
            chars[c-'a']--;
        }

        for(int i:chars){
            if(i!=0){
                return false;
            }
        }
        return true;


//
//        int[] tem = new int[26];
//
//        char[] sc = s.toCharArray();
//        for (int i = 0; i <sc.length ; i++) {
//            tem[sc[i]-'a']++;
//        }
//
//        char[] tc = t.toCharArray();
//        for (int i = 0; i <tc.length ; i++) {
//            tem[tc[i]-'a']--;
//        }
//
//        int index = 0;
//        for (int i = 0; i <tem.length ; i++) {
//            index = i;
//            if(tem[i] != 0){
//                break;
//            }
//        }
//
//        if(index == 5){
//            return true;
//        }else {
//            return false;
//        }
//



    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        char[] s = new char[1000];
//        char[] c = new char[1000];

        String s = "";
        String c = "";
        //boolean isture = true;



        for (int i = 0; i <s.length() ; i++) {
            s = sc.nextLine();
        }

        for (int i = 0; i <c.length() ; i++) {
            c = sc.nextLine();
        }

        boolean isture = isAnagram(s,c);
        System.out.println(isture);


    }
}
