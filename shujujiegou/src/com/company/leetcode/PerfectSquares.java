package com.company.leetcode;

import javafx.util.Pair;

import java.util.LinkedList;

public class PerfectSquares {

    public static int numSquares(int n) {

        if(n == 0){
            return 0;
        }

        LinkedList<Pair<Integer,Integer>> queue = new LinkedList<Pair<Integer, Integer>>();
        queue.addLast(new Pair<Integer, Integer>(n,0));//0为step，queue里有一个数

        boolean[] visited = new boolean[n+1];
        visited[n] = true;

        while (!queue.isEmpty()){
            Pair<Integer,Integer> front = queue.removeFirst();
            int num = front.getKey();
            int step = front.getValue();

            if(num == 0){
                return step;
            }

            for (int i = 0; num - i*i >= 0; i++) {
                int a = num - i*i;
                if(!visited[a]){
                    if(a == 0){
                        return step+1;
                    }
                    queue.addLast(new Pair<>(num - i*i,step + 1));
                    visited[num - i*i] = true;
                }
            }
        }

        throw new IllegalStateException("No Solution");



//    public static int numSquares(int n){
//
//        int[] mem = new int[n+1];
//        Arrays.fill(mem,-1);
//        return numSquares(n,mem);
//    }

//    private static int numSquares(int n,int[] mem){
//        if( n ==0){
//            return 0;
//        }
//        if(mem[n] != -1){
//            return mem[n];
//        }
//        int res = Integer.MAX_VALUE;
//        for (int i = 1; n-i*i >= 0; i++) {
//            res = Math.min(res,1+numSquares(n-i*i,mem));
//
//        }
//        return mem[n] =res;
//    }

//    public static int numSquares(int n){
////        int[] mem = new int[n+1];
////        Arrays.fill(mem,Integer.MAX_VALUE);
////        mem[0] = 0;
////        for (int i = 1; i <= n ; i++) {
////            for (int j = 1; i-j*j >=0; j++) {
////                mem[i] = Math.min(mem[i],1+mem[i-j*j]);
////            }
////        }
////        return mem[n];
    }

    public static void main(String[] args) {
        System.out.println(numSquares(12));
    }
}
