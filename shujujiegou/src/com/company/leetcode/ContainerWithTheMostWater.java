package com.company.leetcode;

public class ContainerWithTheMostWater {

    public static int maxArea(int[] height) {

//        Arrays.sort(height);
//        int h = height[height.length-1] *

        int l = 0;
        int r = height.length - 1;
        int maxarea = 0;
        int[] sum = new int[height.length];
        int index = 0;

        while (l < r) {
            maxarea = Math.max(maxarea,Math.min(height[l],height[r])*(r-l));
            if(height[r] > height[l]){
                l++;
            }else{
                r--;
            }
//            if (height[r] >= height[l]) {
//                sum[index] = height[l] * (r - l);
//                index++;
//
//                l++;
//
//            } else if (height[r] < height[l]) {
//                sum[index] = height[r] * (r - l);
//                index++;
//                r--;

//            }

            }
            return maxarea;

//        Arrays.sort(sum);
//        return sum[sum.length-1];
        }


    }

