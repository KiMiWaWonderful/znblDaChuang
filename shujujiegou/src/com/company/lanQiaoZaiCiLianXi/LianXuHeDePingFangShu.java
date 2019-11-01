package com.company.lanQiaoZaiCiLianXi;

public class LianXuHeDePingFangShu {

    public static void main(String[] args) {
        int n = 1;
        for (int i = 1; i < 1000 / 2; i++) {
            n += 2 * i + 1;
            int m = i+1; // 填空
            if (m * m != n) {
                System.out.printf("加至%d 时不成立！\n", 2 * i + 1);
                break;
            }
        }
    }
}
