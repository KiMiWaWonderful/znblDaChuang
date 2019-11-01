package com.company.lanqiao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Youlishudexunhuanjie {

    public static String f(int m ,int n){
        StringBuffer stringBuffer = new StringBuffer();
        List<Integer> lis = new ArrayList<Integer>();
        String s = m/n + ".";
        m = m % n;
        while (m != 0){
            if(lis.contains(m)){
                int i = 0;
                for (; i < stringBuffer.length() ; i++) {
                    if(stringBuffer.charAt(i) - '0' == m*10/n){
                        break;
                    }
                }
                stringBuffer.insert(i,"[");
                stringBuffer.insert(stringBuffer.length(),"]");
                break;
            }else {
                lis.add(m);
                stringBuffer.append(m*10/n);
            }
            m = m * 10 % n;
        }
        return stringBuffer.insert(0,s).toString();

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        String [] strings = string.split(",");
        int m = Integer.parseInt(strings[0]);
        int n = Integer.parseInt(strings[1]);
        System.out.println(f(m,n));

//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        System.out.println((double)n/m);
    }
}
