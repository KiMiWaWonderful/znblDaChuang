package com.company.jichulianxi;

import java.math.BigInteger;
import java.util.Scanner;

public class Jiechengjisuan {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a[] = new int[n];
//
//        for (int i = 0 ;i<n;i++){
//
//            a[i] = i+1;
//
//        }
//
//        int sum = 1;
//
//        for (int i = 0; i <n ; i++) {
//            sum = sum * a[i];
//
//        }
//
//        System.out.println(sum);
//    }


//    public static void main(String[] args) {
////        Scanner scan = new Scanner(System.in);
////        int n = scan.nextInt();
////        int[] a = new int[n];
////        scan.close();
//        a[0] = 1;
//        int count = 0, count2 = 0;
//        for (int i = 2; i <= n; i++) {
//            int jw = 0;
//            for (int j = 0; j < a.length; j++) {
//                int temp = a[j] * i + jw;
//                if (temp == 0 && i != 2 && count2 <= j)
//                    break;
//                a[j] = temp % 10;
//                jw = temp / 10;
//                if (i != 2)
//                    count = j;
//            }
//            count2 = count;
//        }
//        for (int i = count; i >= 0; i--) {
//            System.out.print(a[i]);
//        }
//        System.out.println();
//    }

//    public static BigInteger f(BigInteger n) {
//        BigInteger bd1=new BigInteger("1");
//        BigInteger bd2=new BigInteger("2");
//        BigInteger sum=bd1;
//        while (n.compareTo(bd1)>0){//如果n比1大
//            sum=sum.multiply(n.multiply(n.subtract(bd1)));//sum= sum*((n-1)*n)
//            n=n.subtract(bd2);//n=n-2;
//        }
//        return sum;
//    }
//    public static void main(String[] args) {
//
//        Scanner in=new Scanner(System.in);
//        BigInteger n=in.nextBigInteger();
//        System.out.println(f(n));
//    }

//    protected static ArrayList table = new ArrayList();
//    static{
//        table.add(BigInteger.valueOf(1));
//    }
//    public static synchronized BigInteger factorial(int x){
//        for (int size = table.size();size<=x;size++){
//            BigInteger lastfact = (BigInteger) table.get(size-1);
//            BigInteger nextfact = lastfact.multiply(BigInteger.valueOf(size));
//            table.add(nextfact);
//        }
//        return (BigInteger)table.get(x);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(factorial(n));
//    }


    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
//        String str = sc.next();
//        int l = str.length();


        BigInteger bi=new BigInteger("1");

        for(int i=2;i<=n;i++){

            bi=bi.multiply(new BigInteger(String.valueOf(i)));

        }

        System.out.println(bi);

    }
}
