package com.company.lanqiao;

public class YangHuiSanJiao {

    public static int f(int m, int n) {
        if (m == 0)
            return 1;
        if (n == 0 || n == m)
            return 1;
        return f(m-1,n-1)+f(m-1,n);
    }
    public static void main(String[] args) {
        System.out.print(f(5,2));
    }

}
