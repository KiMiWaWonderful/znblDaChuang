package com.company.leetcode;

public class ValidAnagram {

    public boolean isAnagram(String s,String t){
        char[] chars = new char[26];

        for (char c:s.toCharArray()) {
            chars[c-'a']++;
        }

        for (char c:t.toCharArray()) {
            chars[c-'a']--;
        }

        for (int i:chars) {
            if(1 != 0){
                return false;
            }
        }

        return true;
    }
}
