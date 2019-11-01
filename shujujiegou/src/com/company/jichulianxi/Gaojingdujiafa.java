package com.company.jichulianxi;

import java.math.BigInteger;
import java.util.Scanner;

public class Gaojingdujiafa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
        String s1 = sc.next();
        String s2 = sc.next();
        BigInteger big1 = new BigInteger(s1);
        BigInteger big2 = new BigInteger(s2);
        System.out.println(big1.add(big2));

    }

//    public static void main(String[] args) throws Exception {
////
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////
////        //读取输入的两个字符串
////        String s1 = br.readLine();
////        String s2 = br.readLine();
////
////        //新建两个数组
////        int a[] = new int[1000];
////        int b[] = new int[1000];
////
////        //计算输入的字符串的长度
////        int l1 = s1.length();
////        int l2 = s2.length();
////
////        //java.lang.Character.getNumericValue(char ch) 返回指定的Unicode字符表示的int值。例如，字符' u216C'(罗马数字50)将返回一个int 值50。
////        //charAt() 方法用于返回指定索引处的字符。索引范围为从 0 到 length() - 1。
////        for (int i = 0; i <l1 ; i++) {
////            a[l1-1-i] = Character.getNumericValue(s1.charAt(i));
////        }
////
////        for (int i = 0; i <l2 ; i++) {
////            a[l2-1-i] = Character.getNumericValue(s2.charAt(i));
////        }
////
////        int max = l1>l2?l1:l2;
////        int c[] = new int[100000];
////
////        for (int i = 0; i <max ; i++) {
////            c[i] = a[i]+b[i];
////
////        }
////
////        for (int i = 0; i <max ; i++) {
////            if(c[i]>9){
////                c[i+1] += c[i]/10;
////                c[i] = c[i] %10;
////            }
////        }
////
////        while (c[max - 1]>0){
////            c[max] = c[max-1]/10;
////            c[max-1] = c[max -1]%10;
////            max++;
////        }
////
////        for (int i = max-1; i >=0 ; i--) {
////            System.out.print(c[i]);
////        }
////    }

//    public static void main(String[] args)
//    {
//        Scanner cin=new Scanner(System.in);
//        int[] a=new int[101];
//        int[] b=new int[101];
//        int[] result=new int[101];
//        for (int i = 0; i <101; i++)
//        {
//            a[i]=b[i]=result[i]=0;
//        }
//        String line1=cin.nextLine();
//        String line2=cin.nextLine();
//
//        for (int i = 0; i < line1.length(); i++)
//            a[i]=(int)line1.charAt(line1.length()-1-i)-48;
//        for (int i = 0; i < line2.length(); i++)
//            b[i]=(int)line2.charAt(line2.length()-1-i)-48;
//
//        int max=line1.length()>line2.length()?line1.length():line2.length();
//
//        int jinwei=0;
//        int r=0;
//        for (int i = 0; i < 101; i++)
//        {
//            result[i]=a[i]+b[i]+r;
//            r=result[i]/10;
//            result[i]%=10;
//        }
//        int flag=100;
//        for (int i = 100; i>-1; i--) {
//            if (result[i]!=0) {
//                flag=i;
//                break;
//            }
//        }
//        for (int i = flag; i >-1; i--) {
//            System.out.print(result[i]);
//        }System.out.println();
//
//    }
}
