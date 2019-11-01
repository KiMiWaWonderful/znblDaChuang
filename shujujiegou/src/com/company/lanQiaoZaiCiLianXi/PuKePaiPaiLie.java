package com.company.lanQiaoZaiCiLianXi;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class PuKePaiPaiLie {

    public static List moveCard(List src) {
        if (src == null)
            return null;
        List dst = new Vector();
        for (;;) {
            if (src.size()==0)
               break;// 填空
            src.add(src.remove(0));
            dst.add(src.remove(0));// 填空
        }
        return dst;
    }
    public static void main(String[] args) {
        List a = new Vector();
        a.addAll(Arrays.asList("A", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "J", "Q", "K"));

        System.out.println(moveCard(a));
    }

}
