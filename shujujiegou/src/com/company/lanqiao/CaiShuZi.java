package com.company.lanqiao;

import java.util.Scanner;

public class CaiShuZi {

    public static void main(String[] args) {
        System.out.println("请在心中想好一个数字（1~100），我来猜");
        System.out.println("我每猜一个数字，你要告诉我是“猜大了”，“猜小了”，还是“猜中”");
        Scanner scan = new Scanner(System.in);
        int v1 = 1;
        int v2 = 100;
        for (;;) {
            int m = (v1 + v2) / 2;
            System.out.println("我猜是：" + m);
            System.out.println("1.猜得太大了");
            System.out.println("2.猜得太小了");
            System.out.println("3.猜中！");
            System.out.print("请选择：");
            int user = Integer.parseInt(scan.nextLine());
            if (user == 3)
                break;
            if (user == 1)
              //  m = (v1 + m) / 2;
                v2 = m;
            if (user == 2)
               // m = (v2 + m) / 2;
                v1 = m;

        }

    }
}
