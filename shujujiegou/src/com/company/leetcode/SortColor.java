package com.company.leetcode;

public class SortColor {

    public static void sortColor(int []nums){
        //int count[3] = 0;
//       int [] count = {0,0,0};
//        for (int i = 0; i <nums.length ; i++) {
//            if(nums[i] >= 0 && nums[i] <=2){
//                count[nums[i]] ++;
//            }
//        }
//
//        int index = 0;
//        for (int i = 0; i <count[0] ; i++) {
//            nums[index] = 0;
//            index++;
//        }
//        for (int i = 0; i < count[1]; i++) {
//            nums[index] = 1;
//            index++;
//        }
//        for (int i = 0; i < count[2]; i++) {
//            nums[index] = 2;
//            index++;
//        }

        int zero = -1;
        int two = nums.length;
        for (int i = 0; i <two; ) {
            if(nums[i] == 1){
                i++;
            }else if(nums[i] == 2){
                int temp = nums[i];
                two--;
                //swap(nums,i,two);
                nums[i] = nums[two];
                nums[two] = temp;

            }else {
                assert nums[i] == 0;
                zero++;
                int temp = nums[zero];
                nums[zero] = nums[i];
                nums[i] = temp;
                //swap(nums,zero,i);
                i++;
            }
        }
    }

//    public static void swap(int[] nums, int i, int j){
//        int t = nums[i];
//        nums[i]= nums[j];
//        nums[j] = t;
//    }



    public static void main(String[] args) {
        int [] arr = {0,1,2,0,1,2,0,1,2,1,1};
        sortColor(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
