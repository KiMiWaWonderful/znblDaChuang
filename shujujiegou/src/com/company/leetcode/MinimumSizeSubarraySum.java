package com.company.leetcode;

public class MinimumSizeSubarraySum {

    public static int minSubArrayLen(int s,int[] nums){

        if(s <= 0 || nums == null)
            throw new IllegalArgumentException("Illigal Arguments");



//        int l = 0,r=-1;
//        int sum = 0;
//        int res = nums.length+1;//初始化成为最大值
//
//        while (l<nums.length){
//            if(r+1<nums.length && sum<s){
//                r++;
//                sum = sum+nums[r];
//            }else if(sum >= s){
//                sum = sum-nums[l];
//                l++;
//            }
//            if(sum >= s){
//                res = Math.min(res,r-l+1);//前闭后闭
//            }
//        }
//
////        while (r+1 < nums.length){
////            while (r+1 < nums.length && sum<s){
////                r++;
////                sum = sum+nums[r];
////            }
////            if(sum >= s){
////                res = Math.min(res,r-l+1);
////            }
////            while (l<nums.length && sum>= s){
////                sum = sum-nums[l];
////                l++;
////                if(sum >= s){
////                    res = Math.min(res,r-l+1);
////                }
////            }
////        }
//        if( res == nums.length+1){
//            return 0;
//        }
//        return res;

        int l = 0;
        int r = -1;
        int sum = 0;
        int res = nums.length+1;

        while (r+1 < nums.length){
            while (sum < s && r+1 < nums.length){//必须是“<”
                r++;
                sum = sum + nums[r];
            }
            if(sum >= s){
                res = Math.min(res,r-l+1);
            }
            while (sum >= s && l+1<nums.length){//必须是“>=”
                sum = sum-nums[l];
                l++;
                if(sum >= s){
                    res = Math.min(res,r-l+1);
                }
            }
        }
        if(res == nums.length){
            return 0;
        }else {
            return res;

        }

    }

    public static void main(String[] args) {
        int [] arr = {2,3,1,2,4,3};
        int s =7;
        int res = minSubArrayLen(7,arr);
        System.out.println(res);
    }
}
