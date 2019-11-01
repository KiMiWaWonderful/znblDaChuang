package com.company.lanqiao;

public class Gubaosuanshi {

    public static void main(String[] args) {
        int y = 0;
        for (int i = 10000; i <100000 ; i++) {
               int a = i/10000;
               int b = i%10000/1000;
               int c = i%10000%1000/100;
               int d = i%10000%1000%100/10;
               int e = i%10;

               if(a == b || a == c || a == d || a == e || b == c || b == d || b == e || c == d || c == e || d == e){
                   continue;
               }

            y = e*10000 + d*1000 + c*100 + b*10 +a;
            if(y% i == 0){
                System.out.println(i+"*"+y/i+"="+y);
                  }
//            if( y == e*10000 + d*1000 + c*100 + b*10 +a){
//                   if(y == i){
//
//                   }
//               }

//            System.out.println("a="+a);
//            System.out.println("b="+b);
//            System.out.println("c="+c);
//            System.out.println("d="+d);
//            System.out.println("e="+e);
//            System.out.println();
        }

//        for (int i = 100; i <1000 ; i++) {
//            int j = i/100;
//            int k = i%100/10;
//            System.out.println("j="+j);
//            System.out.println("k="+k);
//        }
    }
}
