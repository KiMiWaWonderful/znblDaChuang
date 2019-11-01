package com.company.leetcode;

import java.util.HashSet;

public class HappyNumber {

    public static boolean isHappy(int n) {

        if(n==1){
            return true;
        }

        HashSet<Integer> set = new HashSet<>();

        while (n!=1){
            String str = String.valueOf(n);
            n = 0;
            for (int i = 0; i <str.length() ; i++) {
                int temp = Character.getNumericValue(str.charAt(i));
                n = n+temp*temp;
            }
            if(n==1){
                return true;
            }
            if(!set.add(n)){
                return false;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        isHappy(20);
    }
}
