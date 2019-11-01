package com.company.jichulianxi;

import java.util.Scanner;

public class Wanmeidedaijia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] a = new char[n];
        a = sc.next().toCharArray();
        sc.close();
        int j = n - 1;
        int single = 0;
        int sum = 0;
        int k, i;
        for (i = 0; i < j; i++) {   //从左向右遍历
            k = j;
            while (a[i] != a[k]) {
                k--; //从右向左查找
            }if (k == i) { //从两端不断向中间推进，左右两端的指针i，j重合
                single++; //单独的字母
                if (n % 2 == 0 || single > 1) {
                    //总长为偶数则Impossible
                    // 总长为奇数，先跳过这个单独字母，出现第二个单独字母则Impossible
                    System.out.println("Impossible");
                    return;
                } else {
                    sum += n / 2 - i;  //单独的字母移动到中心
                }
            } else { //从两端不断向中间推进，左右两端的指针i，j未重合
                for (int m = k; m < j; m++) { //交换到最后一个位置去
                        a[m] = a[m + 1];
                }
                sum += j - k;
                j--; //右端向中间推进
            }
        }
        System.out.println(sum);
    }
}
