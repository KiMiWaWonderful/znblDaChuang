package com.company.lanqiao;

import java.util.Scanner;
import java.util.Stack;

public class GongShiJieXi {

    public static int add(int x, int y){
        return x+y;
    }
    public static int add(int x, int y,int z){
        return x+y+z;
    }
    public static int min(int x,int y){
        if(x>y){
            return y;
        }else {
            return x;
        }
    }
    public static int max(int x, int y){
        if(x>y){
            return x;
        }else {
            return y;
        }
    }
    public static int doubleMe(int x){
        return x*2;
    }

    public static int check(String string){
        Stack<String> method = new Stack<>();
        Stack<Character> bracket = new Stack<>();
        Stack<String> num = new Stack<>();
        Stack<Integer> count = new Stack<>();

        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer1 = new StringBuffer();
        for (int i = 0; i <string.length() ; i++) {
            char c = string.charAt(i);
            if((c <= 'z' && c>= 'a') || (c <= 'Z' && c >= 'A')){
                stringBuffer.append(c);
            }else if(c == '('){
                method.push(stringBuffer.toString());
                count.push(0);
                stringBuffer.setLength(0);
                bracket.push(')');
            }
            if(c >= '0' && c <= '9'){
                stringBuffer1.append(c);
            }
            if(stringBuffer1.length() != 0){
                num.push(stringBuffer1.toString());
                stringBuffer1.setLength(0);
                count.push(count.pop()+1);
            }
            if(c == ')'){
                String m = method.pop();
                int[] n = new int[count.pop()];
                for (int j = 0; j <n.length ; j++) {
                    n[j] = Integer.parseInt(num.pop());
                }
                bracket.pop();
                if("add".equals(m)){
                    if(n.length == 2){
                        num.push("" + add(n[0],n[1]));
                    }else if(n.length == 3){
                        num.push("" + add(n[0],n[1],n[2]));
                    }
                }else if("min".equals(m)){
                    num.push(""+min(n[0],n[1]));
                }else if("max".equals(m)){
                    num.push(""+max(n[0],n[1]));
                }else if("doubleMe".equals(m)){
                    num.push(""+doubleMe(n[0]));
                }
                if(count.size() != 0){
                    count.push(count.pop() + 1);
                }

            }
        }
        return Integer.parseInt(num.pop());

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入公式串");
        String s = scan.nextLine();
        System.out.println(check(s));

    }
}
