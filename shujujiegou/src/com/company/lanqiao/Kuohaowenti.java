package com.company.lanqiao;

import java.util.Stack;

public class Kuohaowenti {

    public  static boolean isok(String s){

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            if(c == '['){
                stack.push(']');
            }
            if(c == '{'){
                stack.push('}');
            }
            if(c == '('){
                stack.push(')');
            }
            if(c == ']' || c == '}' || c == ')'){
                if(stack.size() == 0){
                    return false;
                }
                if(stack.pop() != c){
                    return false;
                }
            }
        }
        if(stack.size() != 0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isok("....[]({})..."));
    }
}
