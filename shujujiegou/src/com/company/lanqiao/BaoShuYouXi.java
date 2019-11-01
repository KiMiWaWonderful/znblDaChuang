package com.company.lanqiao;

import java.util.Vector;

public class BaoShuYouXi {

    public static void main(String[] args) {
        Vector a = new Vector();
        for(int i=1; i<=10; i++)
        {
            a.add("第" + i + "个孩子");
        }
        for(;;)
        {
            if(a.size()==1) break;
            for(int k=0; k<2; k++){
                a.add(a.remove(0));
            }

            a.remove(0);
        }
        System.out.println(a);

    }

}
