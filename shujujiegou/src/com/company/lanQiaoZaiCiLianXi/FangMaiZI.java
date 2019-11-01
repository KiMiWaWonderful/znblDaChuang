package com.company.lanQiaoZaiCiLianXi;

import java.math.BigInteger;

public class FangMaiZI {

    public static void main(String[] args) {
        BigInteger total = new BigInteger("0");
        BigInteger base = new BigInteger("2");
        for (int i = 0; i < 64; i++) {
            total = total.add(base.pow(i));
            //System.out.println(total);
        }
        System.out.println(total);
      // System.out.println(base.pow(64).add(new BigInteger("-1")));

//        BigInteger total=new BigInteger("0");
//        BigInteger base=new BigInteger("2");
//        for (int i = 0; i < 64; i++) {
//            total=total.add(base.pow(i));
//            //System.out.println(total);
//        }
//        System.out.println(total);
//        System.out.println(base.pow(64).add(new BigInteger("-1")));


    }
}
