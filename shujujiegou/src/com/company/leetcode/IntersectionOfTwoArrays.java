package com.company.leetcode;

import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1,int[] nums2){

//        HashSet<Integer> record = new HashSet<Integer>();
//        for (int num:nums1) {
//            record.add(num);
//        }
//        HashSet<Integer> resultSet = new HashSet<Integer>();
//        for (int num:nums2) {
//            if(record.contains(num)){
//                resultSet.add(num);
//            }
//        }
//
//        int[] res = new int[resultSet.size()];
//        int index = 0;
//        for (Integer num:resultSet) {
//            res[index] = num;
//            index++;
//        }
//
//        return res;



        HashSet<Integer> set1 = new HashSet<Integer>();
        for (int num:nums1) {
            set1.add(num);
        }

        HashSet<Integer> set2 = new HashSet<Integer>();
        for (int num:nums2) {
             if(set1.contains(num)){
                 set2.add(num);
             }
        }

        int[] res = new int[set2.size()];
        int index = 0;
        for (int num:set2) {
            res[index] = num;
        }

        return res;

    }
}
