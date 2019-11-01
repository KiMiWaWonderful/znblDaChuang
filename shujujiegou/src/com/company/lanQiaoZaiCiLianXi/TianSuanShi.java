package com.company.lanQiaoZaiCiLianXi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TianSuanShi {

    static List<int[]> list = new ArrayList<>();

    public static boolean check2(int[] n){
        if(list.size() == 0){
            return false;
        }
        for (int i = 0; i <list.size() ; i++) {
            int a = n[0] * n[1] * n[2];
            int b = list.get(i)[3] * 100 + list.get(i)[4] * 10 + list.get(i)[5];
            if(a != b){
                return false;
            }
        }
        return true;
    }

    public static void check(int[] n){
        int a = n[0] * 100 + n[1] * 10 + n[2] * 1;
        int b = n[3] * 100 + n[4] * 10 + n[5] * 1;
        int c = n[6] * 100 + n[7] * 10 + n[8] * 1;

        if(a + b == c){
            if(!check2(n)){
                list.add(Arrays.copyOf(n,n.length));
            }
        }
    }

    public static void quanPaiLie(int[] n,int start,int end){
        if(start >= end){
            check(n);
            return;
        }

        for (int i = start; i <n.length ; i++) {
            int temp = n[start];
            n[start] = n[i];
            n[i] = temp;

            quanPaiLie(n,start+1,end);

            temp = n[start];
            n[start] = n[i];
            n[i] = temp;

        }
    }
    public static void main(String[] args) {

        int[] n = new int[]{1,2,3,4,5,6,7,8,9};
        check(n);
        quanPaiLie(n,0,n.length-1);
        for(int[] x:list){
            for (int i = 0; i <x.length ; i++) {
                System.out.print(x[i]);
            }
            System.out.println();
        }
        System.out.println(list.size());

//        int sum = 0;
//        int count = 0;
//        for (int i = 1; i <= 9 ; i++) {
//            for (int j = 1; j <= 9 ; j++) {
//                    if(i != j){
//                        for (int k = 1; k <= 9 ; k++) {
//                            if(i != k && j != k){
//                                for (int l = 1; l <= 9 ; l++) {
//                                    if(i != l && j != k && l != k ){
//                                        for (int m = 1; m <= 9 ; m++) {
//                                            if( i != m && j != m && k != m && l != m){
//                                                for (int n = 1; n <= 9 ; n++) {
//                                                    if(i != n && j != n && l != n && m != n && k != n){
//                                                        for (int o = 1; o <= 9 ; o++) {
//                                                            if(i != o && j != o && k != o && l != o && m != o && n != o ){
//                                                                for (int p = 1; p <= 9 ; p++) {
//                                                                    if(i != p && j != p && k != p && l != p && m != p && n != p && o != p){
//                                                                        for (int q = 1; q <= 9 ; q++) {
//                                                                            if(i != q && j != q && k != q && l != q && m != q && n != q && o != q && p != q){
//                                                                                sum = (i*100+j*10+k) + (l*100+m*10+n);
//                                                                                if(sum == (o*100+p*10+q)){
//                                                                                    count++;
//                                                                                    //count = count + 1;
//                                                                                   // System.out.println("("+i*100 +"+"+j*10+"+"+k +")+("+l*100+"+"+m*10+"+"+n+")="+ o*100+"+"+p*10+"+"+q);
//                                                                                    System.out.println((i*100+j*10+k) +"+"+ (l*100+m*10+n)+"="+(o*100+p*10+q));
//
//
//                                                                                }
//
//                                                                            }
//
//                                                                        }
//                                                                    }
//
//                                                                }
//                                                            }
//                                                        }
//                                                    }
//                                                }
//                                            }
//                                        }
//                                    }
//
//                                }
//                            }
//
//                        }
//                    }
//
//            }
//        }
//        System.out.println(count);


    }
}
