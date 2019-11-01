package com.company.lanQiaoZaiCiLianXi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class YouLiShuDeXunHuanJIe {

    public static String f(int m, int n){
        StringBuffer stringBuffer = new StringBuffer();
        List<Integer> list = new ArrayList<>();

        String string = m/n +".";
        m = m % n;
        while (m != 0){
            if(list.contains(m)){
                int i = 0;
                for(; i< stringBuffer.length(); i++){
                    if(stringBuffer.charAt(i) - '0' == m*10/n){
                        break;
                    }
                }
                stringBuffer.insert(i,"[");
                stringBuffer.insert(stringBuffer.length(),"]");
                break;
            }else {
                list.add(m);
                stringBuffer.append(m*10/n);
            }
            m = m * 10 % n;
        }
        return stringBuffer.insert(0,string).toString();

    }
    public static void main(String[] args) {
//        String string = 7/6 +"";
//        System.out.println(string);
//        System.out.println(7%6);
//        System.out.println(7%6%6);

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] strings = string.split(",");
        int m = Integer.parseInt(strings[0]);
        int n = Integer.parseInt(strings[1]);
        System.out.println(f(m,n));

    }


}
