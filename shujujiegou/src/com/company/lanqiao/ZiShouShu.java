package com.company.lanqiao;

public class ZiShouShu {
    public static void zishou() {
        int n;
        for (n = 1; n < 20 * 1000 * 1000; n++) {
            int n2 = n;
            int m = 0;
            for (;;) {
                if (n2 == 0) {
                    System.out.printf("%d\n", n);
                    break;
                }

                int k = n2 % 10; // 从末尾开始，取出乘数的每位数字
                m += k * n; // 累计乘积
                if(m%10!=k)
                    break;  // 填空
                m = m / 10; // 舍去累计乘积的末位
               n2 = n2/10;         // 填空
            }
        }
    }

    public static void main(String[] args) {
        zishou();
    }

}
