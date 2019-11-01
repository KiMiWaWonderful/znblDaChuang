package com.company.lanqiao;

public class BuLianXuChuDuanKai {

    public static void main(String[] args) {
        String s = "12345234568923456789";
        String t = "1";
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1) + 1) {
                t += s.charAt(i);
            } else {
                System.out.println(t);
                t = s.charAt(i)+"";

            }
        }
        System.out.println(t);

    }
}
