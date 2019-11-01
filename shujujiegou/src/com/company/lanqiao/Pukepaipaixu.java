package com.company.lanqiao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pukepaipaixu {

    public static List removeCard(List src){
        List dest = new ArrayList<>();
        for(;;){
            if(src.size() == 0){
                break;
            }
            src.add(src.remove(0));
            dest.add( src.remove(0));
        }
        return dest;
    }
    public static void main(String[] args) {

        List list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "J", "Q", "K"));
        System.out.println(removeCard(list));

    }
}
