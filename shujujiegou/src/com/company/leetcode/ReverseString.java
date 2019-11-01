package com.company.leetcode;

public class ReverseString {

    public String reverseString(String s) {

        StringBuilder str = new StringBuilder(s.length());
        for (char c:s.toCharArray()) {
            str.append(c);
        }
        return  str.reverse().toString();

    }
}
