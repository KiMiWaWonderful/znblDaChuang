package com.company.lanqiao;

import java.util.HashSet;
import java.util.Set;

public class Chuqucifangshu {

    public static void main(String[] args) {
        Set<Double> sets = new HashSet<>();
        sets.add(1.0);
        int i,j = 2;
        for (i = 2;  Math.pow(i,j)<= 10000 ; i++) {
            for (j = 2; Math.pow(i,j) <= 10000 ; j++) {
                sets.add(Math.pow(i,j));
            }
            j = 2;
        }
        System.out.println(10000-sets.size());

        System.out.println((int)Math.pow(2,3));
    }
}
