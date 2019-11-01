package com.company.lanqiao;

import java.util.Vector;

public class Suiji3renzhongjiang {

    public static void main(String[] args) {
        Vector a = new Vector();
        for(char i='A'; i<='F'; i++)
            a.add("" + i);
        for(int k=0; k<3; k++)
        {
           // int d = ((int) (Math.random()*(6-k)));
            int d =(int)(Math.random()*3);



            System.out.println(a.remove(d));
        }

    }

}
