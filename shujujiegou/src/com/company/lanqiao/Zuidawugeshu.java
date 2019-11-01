package com.company.lanqiao;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Zuidawugeshu {

    public static List<Integer> max(List<Integer> list){
        if(list.size() <= 5){
            return list;
        }
        int a = list.remove(list.size()-1);
        List<Integer> list1 = max(list);
        for (int i = 0; i <list1.size() ; i++) {
            int t = list1.get(i);
            if(a>t){
                list.set(i,a);
                a = t;
            }
        }
        return list1;
    }
    public static void main(String[] args) {
        List<Integer> lst = new Vector<Integer>();
        lst.addAll(Arrays.asList(12, 127, 85, 66, 27, 34, 15, 344, 156, 344,
                29, 47));
        System.out.println(max(lst));

    }
}
