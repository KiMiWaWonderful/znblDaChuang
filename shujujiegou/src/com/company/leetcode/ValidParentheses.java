package com.company.leetcode;

//import com.company.stack.Stack;

import java.util.Stack;

public class ValidParentheses {

    public static  boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();

        for (int i = 0; i <s.length() ; i++) {
            if(chars[i] == '(' || chars[i] == '{' || chars[i] == '['){
                stack.push(chars[i]);
            }else {
                if(stack.size() == 0){
                    return false;
                }

                Character c = stack.pop();
                Character match;

                if(chars[i] == ')'){
                    match = '(';
                }else  if(chars[i] == ']'){
                    match = '[';
                }else {
                    assert (chars[i] == '}');
                    match = '{';
                }
                if( c!= match){
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
        System.out.println(isValid("()[]"));
    }
}
