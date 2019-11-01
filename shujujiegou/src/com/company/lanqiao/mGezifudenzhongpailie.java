package com.company.lanqiao;

import java.util.ArrayList;
import java.util.List;

public class mGezifudenzhongpailie {

    static int count = 0;

    public static void f(List<Integer>lis, int start){
        if(start>=lis.size()){
            System.out.println(lis);
            count++;
            return;
        }
        for (int i = 1; i <= 9 ; i++) {
            if(!lis.contains(i)){
                lis.set(start,i);
            }else {
                continue;
            }
            f(lis,start+1);
            lis.set(start,-1);
        }
    }
    public static void main(String[] args) {

        int n = 5;
        List<Integer> lis = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            lis.add(-1);
        }
        f(lis,0);
        System.out.println(count);
    }
}
