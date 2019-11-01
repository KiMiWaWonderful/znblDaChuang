package com.company.lanqiao;

import java.util.Scanner;
import java.util.Stack;

public class Dizhizhuanhuan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();//没有这句话会多出2行空白行
        while (n>0){
            String string = scanner.nextLine();
           // System.out.println(string);
            String[] strings = string.split("C");
//            for (int i = 0; i <strings.length ; i++) {
//                System.out.print(strings[i]+" ");
//            }
            strings[0] = strings[0].substring(1,strings[0].length());

            int hangshu = Integer.parseInt(strings[0]);
            int lieshu = Integer.parseInt(strings[1]);
          //  System.out.println(strings[0]);

            Stack<Character> stack = new Stack<>();
            while (lieshu > 0){
                if(lieshu%26 == 0){
                    stack.push('Z');
                    lieshu = lieshu/26 -1;
                }else {
                    stack.push((char) ('A'-1+lieshu%26));
                    lieshu = lieshu/26;
                }
            }
            while (!stack.empty()){
                System.out.print(stack.pop());
            }
            System.out.print(hangshu);
            n--;

    }
    }
}
