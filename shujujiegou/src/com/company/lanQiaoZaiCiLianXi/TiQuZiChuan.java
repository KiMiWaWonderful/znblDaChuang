package com.company.lanQiaoZaiCiLianXi;

public class TiQuZiChuan {

    public static String getMaxMirrorString(String s) {
        String max_s = ""; // 所求的最大对称子串
        for (int i = 0; i < s.length(); i++) {
            // 第一种对称模式
            int step = 1;
            try {
                for (;;) {
                    if (s.charAt(i - step) != s.charAt(i + step))
                        break;
                    step++;
                }
            } catch (Exception e) {
            }
            String s1 = s.substring(i-step+1,i+step); // 填空1
            // 第二种对称模式
            step = 0;
            try {
                for (;;) {
                    if (s.charAt(i - step) != s.charAt(i + step + 1))
                       break; // 填空2
                    step++;
                }
            } catch (Exception e) {
            }
            String s2 = s.substring(i - step + 1, i + step + 1);
            if (s1.length() > max_s.length())
                max_s = s1;
            if (s2.length() > max_s.length())
                max_s = s2;
        }
        return max_s;
    }
    public static void main(String[] args) {
        String s = "abcdeefghhgfeiieje444k444lmn";
        System.out.println(getMaxMirrorString(s));
    }

}
