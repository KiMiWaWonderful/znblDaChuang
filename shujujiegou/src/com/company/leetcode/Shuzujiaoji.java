package com.company.leetcode;

import java.util.*;

public class Shuzujiaoji {

    public static int[] intersection(int[] nums1, int[] nums2) {

//        int [] a = new int[nums1.length];
////        //int [] b = new int[nums1.length];
////
////        for (int i = 0; i <nums1.length ; i++) {
////            for (int j = 0; j <nums2.length ; j++) {
////                if(nums1[i] == nums2[j]){
////                    for (int k = 0;  ; k++) {
////                        a[k] = nums1[i];
////                    }
////
////                }
////            }
////        }
////
////        //LinkedHashSet<Object> set = new LinkedHashSet<Object>();
////        //List list = new ArrayList();
////        int t =0;
////        int[] tempArr = new int[a.length];
////        for (int i = 0; i <a.length ; i++) {
//////            if(!list.contains(a[i])){
//////                list.add(a[i]);
//////            }
////            boolean isTrue = true;
////            for (int j = i+1; j <a.length ; j++) {
////                if(a[i] == a[j]){
////                    isTrue = false;
////                    break;
////                }
////            }
////            if(isTrue){
////                tempArr[t] = a[i];
////                t++;
////            }
////        }
////
////        int[] b = new int[t];
////        //System.arraycopy(tempArr,0,b,0);
////        for (int i = 0; i <tempArr.length ; i++) {
////            b[i] = tempArr[i];
////        }
////       // Object [] b = list.toArray();
////        return b;

//        HashMap<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i <nums1.length ; i++) {
//            for (int j = 0; j <nums2.length ; j++) {
//                if(nums1[i] == nums2[j]){
//                    if(!map.containsKey(nums1[i])){
//                        map.put(nums1[i],nums2[j]);
//                        break;
//                    }
//                }
//            }
//        }
//
//        int num[] = new int[map.size()];
//        if(map.size()<0){
//            return num;
//        }
//        Set<Integer> set = map.keySet();
//        int k = 0;
//        for(Integer n:set){
//            num[k] = n;
//            k++;
//        }
//        return num;

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i <nums1.length ; i++) {
            set1.add(nums1[i]);
        }

        for (int i = 0; i <nums2.length ; i++) {
            if(set1.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        }

        int num[] = new int[set2.size()];
        if(set2.size()<=0){
            return num;
        }
        int i = 0;
        for(Integer n:set2){
            num[i] = n;
            i++;
        }
        return num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] a = new int[1000];
        int [] b = new int[1000];

        for (int i = 0; i <a.length ; i++) {
            a[i] = sc.nextInt();
            //b[i] = sc.nextInt();
        }

        for (int i = 0; i <b.length ; i++) {
            b[i] = sc.nextInt();
            //b[i] = sc.nextInt();
        }

        int [] c  = intersection(a,b);


        for (int i = 0; i <c.length ; i++) {
            System.out.print(c[i]);
        }



    }
}
