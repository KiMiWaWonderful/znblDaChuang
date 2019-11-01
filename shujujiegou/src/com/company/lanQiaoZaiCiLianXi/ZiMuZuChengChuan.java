package com.company.lanQiaoZaiCiLianXi;

public class ZiMuZuChengChuan {

    public static int kinds = 0;
    public static int k[] = new int[5];

    public static void dfs(int m, int n){
        if(m == n){
            if(is_even()){
                kinds ++;
            }
            return;
        }else {
            for (int i = 0; i <n-1 ; i++) {
                k[m] = i;
                dfs(m + 1,n);
            }
        }
    }

    public static boolean is_even(){
        int sum = 0;
        for (int i = 0; i <k.length ; i++) {
            if(k[i] % 2 == 0){
                sum ++;
            }
        }
        if(sum % 2 == 0){
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args) {

        dfs(0,5);
        System.out.println(kinds);

       // System.out.println(Double.MAX_VALUE);

//        String s = "123456";
//        System.out.println(s.substring(1));
    }
}
