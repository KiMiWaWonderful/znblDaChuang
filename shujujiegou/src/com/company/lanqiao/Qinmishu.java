package com.company.lanqiao;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Qinmishu {

    public static int obtain(int n){
        int sum = 0;
        for (int i = 1; i <n ; i++) {
            if(n%i == 0){
                sum = sum + i;
            }

        }
        return sum;
    }
    public static void main(String[] args) {

        int n = 1000;
        Set<Set<Integer>> sets = new LinkedHashSet<Set<Integer>>();
        for (int i = 1; i <= n ; i++) {
            int t = obtain(i);
            if(i != t){
                if(obtain(t) == i){
                    Set<Integer> set = new LinkedHashSet<>();
                    set.add(i);
                    set.add(t);
                    sets.add(set);
                }
            }
        }

        for(Iterator iterator = sets.iterator();iterator.hasNext();){
            Set<Integer> set = (Set<Integer>) iterator.next();
            for(Iterator iterator1 = set.iterator();iterator1.hasNext();){
                Integer integer = (Integer) iterator1.next();
                System.out.print(integer);
                if(iterator1.hasNext() == false){
                    System.out.println();
                }else {
                    System.out.print(" ");
                }
            }
        }
    }
}
