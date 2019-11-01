package com.company.lanQiaoZaiCiLianXi;

import java.util.List;

public class ZuiDaWuGeShu {

    public static List<Integer> max5(List<Integer> lst) {
        if (lst.size() <= 5)
            return lst;
        //int a = lst.remove(0); // 填空
        int a = lst.remove(lst.size()-1);
        List<Integer> b = max5(lst);
        for (int i = 0; i < b.size(); i++) {
            int t = b.get(i);
            if (a > t) {
                lst.set(i, a);// 填空
                a = t;
            }
        }
        return b;
    }

    private static int getRealValue(char x)
    {
        if(x>='0' && x<='9') return x-'0';
        if(x>='a' && x<='f') return x-'a'+10;
        if(x>='A' && x<='F') return x-'A'+10;
        return 0;
    }

    public static void main(String[] args) {
//        List<Integer> lst = new Vector<Integer>();
//        lst.addAll(Arrays.asList(12, 127, 85, 66, 27, 34, 15, 344, 156, 344,
//                29, 47));
//        System.out.println(max5(lst));

      // System.out.println('B'-'0' + 10);

//        String x = "16F";
//        int n = 0; // 累加真值
//        for(int i=0; i<x.length(); i++)
//        {
//            n = n+ getRealValue(x.charAt(i));  // 填空
//        }
//        System.out.println(n);

        System.out.println(Integer.toHexString(170));

    }
}
