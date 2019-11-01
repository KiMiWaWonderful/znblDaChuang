package com.company.leetcode;

import java.util.HashSet;

public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        if(nums == null || nums.length <= 1)
            return false;

        if(k <= 0)
            return false;



        HashSet<Integer> record = new HashSet<>();//保持大小在k+1以内
        for (int i = 0 ; i <nums.length ; i++) {
            if(record.contains(nums[i])){
                return true;
            }else {
                record.add(nums[i]);
            }
            if(record.size() == k+1){
                record.remove(nums[i-k]);//删除窗口最左侧的数据
            }
        }
        return false;

    }
}
