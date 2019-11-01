package com.company.leetcode;

public class MoveZero {

    public  static  void moveZeroes(int [] nums){
//        int count = 0;
//        for(int n:nums){
//            if(n == 0){
//                count++;
//            }
//        }
       // Stack stack ;
        //Queue<Integer> queue = new Queue<Integer>()
//        int [] nonZeroElements = new int[nums.length-count];
//        int countt = 0;
//        for (int i = 0; i <nums.length ; i++) {
//            if(nums[i] != 0){
//               // nonZeroElements[i] = nums[i];
////                for (int j = i; j <nonZeroElements.length ; j++) {
////                    nonZeroElements[j] = nums[i];
////                }
////                for (int j = i; j < i; j++) {
////                    nonZeroElements[j] = nums[i];
////                }
//                //stack.pop(nums[i]);
//                nonZeroElements[countt] = nums[i];
//                countt++;
//            }
//        }
//
//        for (int i = 0; i <nonZeroElements.length ; i++) {
//            nums[i] = nonZeroElements[i];
//        }
//
//        for (int i = nonZeroElements.length; i <nums.length ; i++) {
//            nums[i] = 0;
//        }

//        for (int i = 0; i <nonZeroElements.length ; i++) {
//            System.out.print(nonZeroElements[i]+" ");
//        }

//        int k = 0;
//        for (int i = 0; i <nums.length ; i++) {
//            if(nums[i] != 0){
//                nums[k] = nums[i];
//                k++;
//            }
//        }
//        for (int i = k; i <nums.length ; i++) {
//            nums[i] = 0;
//        }

        int k = 0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i] != 0){
                if(i!=k){
                    int temp = nums[k];
                    nums[k] = nums[i];
                    nums[i] = temp;
                    k++;
                }


            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {0,1,3,0,5};
        moveZeroes(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
