package com.company.leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArraysII {

    public int[] intersect(int[] nums1,int[] nums2){

        HashMap<Integer,Integer> record = new HashMap<>();
        for (int num:nums1) {
            if(!record.containsKey(num)){
                record.put(num,1);//值为频率
            }else{
                record.put(num,record.get(num) + 1);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int num:nums2) {
            if(record.containsKey(num) && record.get(num) >0){
                result.add(num);
                record.put(num,record.get(num)-1);
            }
        }

        int[] res = new int[result.size()];
        int index = 0;
        for (int num:result) {
            res [index] = num;
            index++;
        }

        return res;
    }
}
