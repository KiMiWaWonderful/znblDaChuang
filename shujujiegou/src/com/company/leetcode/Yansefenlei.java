package com.company.leetcode;

import java.util.Arrays;

public class Yansefenlei {

    public void sortColors(int[] nums) {

//        int i = -1,j= -1,k = -1;
//        for (int m = 0; m <nums.length ; m++) {
//            if(nums[m] == 0){
//                nums[++k] = 2;
//                nums[++j] = 1;
//                nums[++i] = 0;
//            }else if(nums[m] == 1){
//                nums[++k] = 2;
//                nums[++j] = 1;
//            }else {
//                nums[++k] = 2;
//            }
//        }

        int[] a = new int[nums.length];
        a = Arrays.copyOf(nums,nums.length);

        int i = 0;
        int j = nums.length-1;
        for (int k = 0; k <nums.length ; k++) {
            if(a[k] == 0){
                nums[i++] = a[k];
            }else if(a[k] == 2){
                nums[j--] = a[k];
            }
        }
        while (i<=j){
            nums[i++] = 1;
        }

    }
}
