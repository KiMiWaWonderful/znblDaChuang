package com.company.lanqiao;

public class Youqudepingfangshu {

    public static void main(String[] args) {

        for (int i = 100; i <1000 ; i++) {
            String str = String.valueOf(i);
            int sum = i * i;
            String string = String .valueOf(sum);
            String string1 = string.substring(string.length()-3,string.length());

            //不可以写string1==str
            //=="比较的是2个对象的地址，而".equals()"比较的是2个对象的内容，
            if(string1.equals(str)){
                System.out.println(i);
            }
        }

        int temp = 0;
        for(int i = 100; i <= 999; ++i){
            temp = i*i;
            temp %= 1000;
            if(temp == i)System.out.println(i);
        }


//        int str =390625;
//        String string =String.valueOf(str);
//        for (int i = 0; i <string.length() ; i++) {
//           System.out.print(string.charAt(i) + " ,") ;
//        }
//       // String s = "390625";
//        System.out.println(string.substring(string.length()-3,string.length()));
    }
}
