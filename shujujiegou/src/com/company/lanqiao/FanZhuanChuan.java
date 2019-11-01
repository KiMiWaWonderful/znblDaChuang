package com.company.lanqiao;

public class FanZhuanChuan {
    public static String reverseString(String x) {
        if (x == null || x.length() < 2)
            return x;
        return reverseString(x.substring(1) + x.charAt(0));
    }
    public static void main(String[] args) {
        System.out.println(reverseString("cba"));
    }


}
