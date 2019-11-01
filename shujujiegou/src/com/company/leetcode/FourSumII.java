package com.company.leetcode;

import java.util.HashMap;

public class FourSumII {

    public int fourSumCount(int[]A,int[]B,int[]C,int[]D){

        if(A == null || B == null || C == null || D == null)
            throw new IllegalArgumentException("Illegal argument");

        HashMap<Integer,Integer> record = new HashMap<>();

        for (int i = 0; i < C.length ; i++) {
            for (int j = 0; j < D.length ; j++) {
                int sum = C[i] + D[j];
                if(record.containsKey(sum)){
                    record.put(sum,record.get(sum) + 1);
                }else{
                    record.put(sum,1);
                }

            }
        }

//        HashMap<Integer,Integer> recordd = new HashMap<>();
//
//        for (int i = 0; i <A.length ; i++) {
//            for (int j = 0; j <B.length ; j++) {
//                int sum = A[i] + B[j];
//                if(recordd.containsKey(sum)){
//                    recordd.put(sum,recordd.get(sum)+1);
//                }else{
//                    recordd.put(sum,1);
//                }
//            }
//        }

        int res = 0;
//        for (Integer sumab:recordd.keySet()) {
//            if(record.containsKey(-sumab)){
//                res = res + recordd.get(sumab) + record.get(-sumab);
//            }
//        }
        for (int i = 0; i <A.length ; i++) {
            for (int j = 0; j <B.length ; j++) {
                if(record.containsKey(0 - A[i] - B[j])){
                    res = res + record.get(0 - A[i] - B[j]);
                }
            }
        }
        return res;

    }
}
