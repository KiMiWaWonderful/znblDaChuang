package com.company.leetcode;

import java.util.Arrays;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int [] temp = new int[m+n];
        int index = m;
            for (int num: nums2) {
                nums1[index] = num;
                index++;

            }
        Arrays.sort(nums1);




//        for (int i = 0; i < nums1.length; i++) {
//            for (int j = 0; j <nums2.length ; j++) {
//
//            }
//        }
    }
}
