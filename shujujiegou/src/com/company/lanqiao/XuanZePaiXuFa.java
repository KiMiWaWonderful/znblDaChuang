package com.company.lanqiao;

public class XuanZePaiXuFa {

    public static void sel_sort(int[] x, int n){
        int k, i, m, t;
        for(k=0; k<n-1; k++){  // 多趟排序
           m = k;// 填空1
            for(i=k+1; i<n; i++){
                if(x[i] < x[m])
                  m=i;
                    // 填空2
            }
            t = x[k];
            x[k] = x[m];
            x[m] = t;
        }
    }
    public static void display(int[] x, int n) {
        for (int i = 0; i < n; i++)
            System.out.printf("%d ", x[i]);
        System.out.printf("\n");
    }

    public static void main(String[] args) {
        int N = 10;
        int a[] = { 5, 12, 35, 28, 19, 22, 36, 17, 4, 11 };
        display(a, N);
        sel_sort(a, N);
        display(a, N);
    }

}
