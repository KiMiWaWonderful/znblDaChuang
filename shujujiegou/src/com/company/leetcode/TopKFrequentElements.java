package com.company.leetcode;

import javafx.util.Pair;

import java.util.*;

public class TopKFrequentElements {

//    public static List<Integer> topKFrequent(int[] nums, int k) {
//
//        if(k<=0){
//            throw new IllegalArgumentException("k should be greater than 0");
//        }
//
//        //统计每个元素的频率
//        HashMap<Integer,Integer> freq = new HashMap<Integer, Integer>();
//       for (int i = 0; i <nums.length ; i++) {
//            if(freq.containsKey(nums[i])){
//                freq.put(nums[i],freq.get(nums[i])+1);
//            }else {
//                freq.put(nums[i],1);
//            }
//        }
//
//        if(k>freq.size()){
//            throw new IllegalArgumentException("k should be less than the number of unique numbers in nums");
//        }
//
//        ArrayList<Integer> res = new ArrayList<>();
//        for (Integer key:freq.keySet()) {
//            res.add(key);
//        }
//
//        //排序，a的值比b小
//        Collections.sort(res,(a,b) ->{
//            if(freq.get(a) != freq.get(b)) {
//                return freq.get(b) - freq.get(a);
//            }
//                return  a-b;
//
//        });
//
//        return res.subList(0,k);
//
//    }

    private static class PairComparator implements Comparator<Pair<Integer,Integer>>{
        @Override
        public int compare(Pair<Integer, Integer> p1, Pair<Integer, Integer> p2) {
            if(p1.getKey() != p2.getKey()){
                return p1.getKey() - p2.getKey();
            }
            return p1.getValue() - p2.getValue();
        }
    }

    public static List<Integer> topKFrequent(int[] nums,int k){

        if(k<=0){
            throw new IllegalArgumentException("k should be greater than 0");
        }

        HashMap<Integer,Integer> freq = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            if(freq.containsKey(nums[i])){
                freq.put(nums[i],freq.get(nums[i])+1);
            }else {
                freq.put(nums[i],1);
            }
        }
        //得到的map排序按照value由高到低

        if(k>freq.size()){
            throw new IllegalArgumentException("k should be less than the number of unique numbers in nums");
        }

        PriorityQueue<Pair<Integer,Integer>> pq = new PriorityQueue<Pair<Integer, Integer>>(new PairComparator());
        for (Integer num:freq.keySet()) {
            int numFreq = freq.get(num);
            if(pq.size() == k){//只装频率高的前k个
                if(numFreq > pq.peek().getKey()){
                    pq.poll();
                    pq.add(new Pair<>(numFreq,num));
                }
            }else {
                pq.add(new Pair<>(numFreq,num));//key为频率，value为频率对应的数字
            }
        }
        //pq得到map的前k个，但是是由频率低的到频率高的

        ArrayList<Integer> res = new ArrayList<>();
        while ( !pq.isEmpty()){
            res.add(pq.poll().getValue());//得到的是数字
        }

        return res;
    }

    public static void main(String[] args) {

        int[] nums = {1,1,1,2,2,3};

      int   k = 2;
      List<Integer> list = topKFrequent(nums,k);
        for (int num:list) {
            System.out.print(num+" ");
        }
    }
}
