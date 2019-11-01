package com.company.lanqiao;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Chuandejiandanchuli {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();//不用next
        System.out.println(string);
       // String test = string.replaceAll("\\s{1,}"," ");//必须要让一个新的字符串

        String[] ss = string.split("[\\s]+");
        for (int i = 0; i <ss.length ; i++) {

            String up =(""+ss[i].charAt(0)).toUpperCase();//每个空格后的首字母，加双引号可以把字符转化成字符串
           System.out.println("up="+up);
            StringBuffer stringBuffer = new StringBuffer(ss[i]);
            ss[i] = stringBuffer.replace(0,1,up).toString();

            Matcher m = Pattern.compile("\\d+").matcher(ss[i]);// "\d"标识0-9
            while(m.find()){
                String num = new String(m.group());
                System.out.println("num="+num);
                String num2 = num;
                num2 = "_"+num+"_";     // 数字前添加"_"
                System.out.println("num2="+num2);
                ss[i] = ss[i].replace(num, num2);
                if(ss[i].startsWith("_")){  // 去头"_"
                    ss[i] = ss[i].substring(1);
                }
                if(ss[i].endsWith("_")){    // 去尾"_"
                    ss[i] = ss[i].substring(0,ss[i].length()-1);
                }
            }

            //System.out.print(ss[i] + " ");
        }

        //String[] ss = test.
//        for (int i = 0; i <test.length() ; i++) {
//            String up = (""+test[i].charAt(0)).toUpperCase();
//        }
       // System.out.println(test);


        //char[] data = test.toCharArray();

        // data[0] = (char) (data[0]+32);
//        for (int i = 0; i <data.length ; i++) {
////            //System.out.print(data[i] + " ");
////
////            if(i == 0){
////               // Character.toUpperCase(data[i]);
////                //data[i]
////            }
////            System.out.print(data[i] + " ");
////
////        }



    }
}
