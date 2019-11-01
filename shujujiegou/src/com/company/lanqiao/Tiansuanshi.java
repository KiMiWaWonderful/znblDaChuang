package com.company.lanqiao;

import java.util.Vector;

public class Tiansuanshi {

    public static int count = 0;

    public static void AllType(Vector<Character> source, Vector<Character> result){
        if(source.size() == 0){
            int a = (result.elementAt(0) - '0')*100 + (result.elementAt(1)-'0')*10 + (result.elementAt(2)-'0');
            int b = (result.elementAt(3) - '0')*100 + (result.elementAt(4)-'0')*10 + (result.elementAt(5)-'0');
            int c = (result.elementAt(6) - '0')*100 + (result.elementAt(7)-'0')*10 + (result.elementAt(8)-'0');
            if(a*b == c){
                System.out.println(a+"+"+b+"="+c);
                count++;
            }
        }else {
            for (int i = 0; i <source.size() ; i++) {
                result.add(source.elementAt(i));
                source.remove(i);
                AllType(source,result);
                source.add(i,result.elementAt(result.size()-1));
                result.remove(result.size()-1);
            }
        }
    }
    public static void main(String[] args) {

    }
}
