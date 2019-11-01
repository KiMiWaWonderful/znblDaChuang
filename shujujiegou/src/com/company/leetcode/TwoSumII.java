package com.company.leetcode;

public class TwoSumII {

    public static int[] twoSum(int[] nums,int target) {
        int l = 0;
        int r = nums.length-1;
        //int [] res = new int[2];
        //try {
            while (l<r){
                if(nums[l] + nums[r] == target){
                    //res = {l+1,r+1};
                    //return res;
//                    res[0] = l+1;
//                    res[1] = r+1;
                    int[] res = {l+1,r+1};
                    return res;
                }else if(nums[l] + nums[r] <target)
                    l++;
                else if(nums[l] + nums[r] >target)
                    r --;
            }

        //return res;

//        if(numbers.length < 2 /*|| !isSorted(numbers)*/)
//            throw new IllegalArgumentException("Illegal argument numbers");
//
//        int l = 0, r = numbers.length - 1;
//        while(l < r){
//            if(numbers[l] + numbers[r] == target){
//                int[] res = {l+1, r+1};
//                return res;
//            }else if(numbers[l] + numbers[r] < target)
//                l ++;
//            else // numbers[l] + numbers[r] > target
//                r --;
//        }
      throw new IllegalStateException("The input has no solution");//不加上这条语句会报错

    }

    public static void main(String[] args) throws Exception {
        int [ ]arr = {2,7,11,15};
        int[] res = twoSum(arr,9);
        for (int i = 0; i <res.length ; i++) {
            System.out.print(res[i]+" ");
        }

    }
}
