package com.company.leetcode;

public class LargestSubstringWithoutRepeatingCharaters {

    public static int lengthOfLongestSubstring(String s){
        int [] freq = new int[256]; //256个不同字母出现的频率
        int l = 0;
        int r = -1;
        int res = 0;

        while (l<s.length()){
            if(r+1<s.length() && freq[s.charAt(r+1)] == 0){//如果没有相同的字符，窗口向右移动
                r++;
                freq[s.charAt(r)]++;
            }else {
                freq[s.charAt(l)]--;
                l++;
            }
            res = Math.max(res,r-l+1);
        }
        return res;
    }




}
