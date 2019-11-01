package com.company.lanqiao;

public class Mahudesuanshi {

    public static void main(String[] args) {
        int count = 0;
        for (int a = 1; a <=9 ; a++) {
            for (int b = 1; b <=9 ; b++) {
                if(a != b){
                    for (int c = 1; c <=9 ; c++) {
                        if(a != c && b != c){
                            for (int d = 1; d <=9 ; d++) {
                                if(a != d && b != d && c != d){
                                    for (int e = 1; e <=9 ; e++) {
                                        if(a != e && b != e && c != e && d != e ){
                                            int sum = (a * 10 + b) * (c * 100 + d * 10 + e);
                                            int sum1 = (a * 100 + d * 10 + b) * (c * 10 + e);
                                            //不需要加上是否为偶数的判断
                                            if(sum == sum1  ){
                                                //  System.out.println((a * 10 +"+"+ b) +"*"+ (c * 100+" + "+d * 10 + e) +"="+ (a * 100 + d * 10 + b) * (c * 10 + e));
                                               // System.out.println(sum +","+sum);
                                                System.out.printf("%d%d * %d%d%d = %d%d%d * %d%d" , a,b,c,d,e,a,d,b,c,e);
                                                System.out.println();
                                               count = count+1;
                                            }
                                        }

                                    }
                                }

                            }
                        }

                    }
                }

            }
        }

        System.out.println(count);



//        int a, b, c, d, e;
//        int count=0;
//        for (a = 1; a < 10; a++) {
//            for (b = 1; b < 10; b++) {
//                if (b != a) {
//                    for (c = 1; c < 10; c++) {
//                        if (c != b && c != a) {
//                            for (d = 1; d < 10; d++) {
//                                if (d != a && d != b && d != c) {
//                                    for (e = 1; e < 10; e++) {
//                                        if (e != a && e != b && e != c
//                                                && e != d) {
//                                            if ((a * 10 + b)
//                                                    * (c * 100 + d * 10 + e) == (a
//                                                    * 100 + d * 10 + b)
//                                                    * (c * 10 + e)) {
//                                                System.out.printf("%d%d*%d%d%d = %d%d%d*%d%d\n",a, b, c, d, e,a, d, b, c, e);
//                                                count++;
//                                            }
//                                        }
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(count);

    }
}
