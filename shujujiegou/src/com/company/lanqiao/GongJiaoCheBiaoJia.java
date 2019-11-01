package com.company.lanqiao;

public class GongJiaoCheBiaoJia {

    // m: 持有5角币的人数
    // n: 持有1元币的人数
    // 返回：所有顺利完成购票过程的购票次序的种类数

    public static int f(int m, int n) {
        if (m < n)
            return 0;
        if (n == 0)
            return 1;
        return f(m,n-1)+f(m-1,n); // 填空
    }
    public static void main(String[] args) {
        System.out.println(f(10, 8));
    }

}
