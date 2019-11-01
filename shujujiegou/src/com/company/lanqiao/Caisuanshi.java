package com.company.lanqiao;

import java.util.ArrayList;
import java.util.List;

public class Caisuanshi {

    static List<String> list = new ArrayList<>();
    static List<String> list1 = new ArrayList<>();

    public static void initInt(int[] data){
        for (int i = 0; i <9 ; i++) {
            data[i] = i+1;
        }
    }

    public static boolean  isDup(String string,String string1){
        String a1 = string.substring(0,2);
       // System.out.println("a1="+a1);
        String b1 = string1.substring(0,2);
       // System.out.println("b1="+b1);
        String a2 = string.substring(2,4);
        //System.out.println("a2="+a2);
        String b2 = string1.substring(2,4);
        //System.out.println("b2="+b2);

        if(a1.equals(b1) ||a2.equals(b2) ){
                return true;
        }else {
            return false;
        }
    }

    public static void removeDuplicate(){
        list1.add(list.get(0));
        for (int i = 0; i <list.size() ; i++) {
            boolean flag = true;
            for (int j = 0; j <list1.size() ; j++) {
                flag = isDup(list.get(i),list1.get(j));
                if(flag)
                    break;
            }
            if(!flag){
                list1.add(list.get(i));
            }

        }
    }

    public static void print(){
        for(String s:list1){
            String a = s.substring(0,2);
            String b = s.substring(2,4);
            String c = s.substring(4,6);
            String d = s.substring(6);
            System.out.println(a+"*"+b+"="+c+"*"+d);
        }
    }

    public static void check(int[] n){
        StringBuilder stringBuilder = new StringBuilder();
        for(int x:n){
            stringBuilder.append(x);
        }
        int a = Integer.parseInt(stringBuilder.substring(0,2).toString());
        int b = Integer.parseInt(stringBuilder.substring(2,4).toString());
        int c = Integer.parseInt(stringBuilder.substring(4,6).toString());
        int d = Integer.parseInt(stringBuilder.substring(6).toString());

        if(a*b == c*d){
            list.add(stringBuilder.toString());
        }
    }

    public static void allSort(int[] n,int start,int end){
        if(start>=end){
            check(n);
            return;
        }else{
            for (int i = start; i <=end ; i++) {
                int t = n[start];
                n[start] = n[i];
                n[i] = t;

                allSort(n,start+1,end);

                t = n[start];
                n[start] = n[i];
                n[i] = t;

            }
        }
    }

    public static void fun(){
        int [] data = new int[9];
        initInt(data);
        allSort(data,0,data.length-1);
        removeDuplicate();
    }

    public static void main(String[] args) {
        //System.out.println(isDup("2345","3456"));
        fun();
        print();
    }
}
