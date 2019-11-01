package com.company.leetcode;

import java.util.Collections;
import java.util.List;

public class Shanchuzuichangdanci {

    private boolean help(String s,String t){
        boolean flag = false;
        int i = 0,j = 0;
        while (i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else {
                i++;
            }
        }
        if(j == t.length()){
            flag = true;
        }
        return flag;
    }

    public boolean isLegal(String s, String target) {
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j >= target.length()) {
                break;
            }
            if (s.charAt(i) == target.charAt(j)) {
                j++;
            }
        }
        return j == target.length();
    }

    public String findLongestWord(String s, List<String> d) {

        //Arrays.sort(d);
        Collections.sort(d);
        String res = "";
        for (String item:d) {
            if(help(s,item) && item.length()>res.length()){
                res = item;
            }
        }
        return res;

//        //String lword = "";
//        for (String target : d) {
//            int len1 = lword.length();
//            int len2 = target.length();
//            if (len1 > len2 || (len1 == len2 && lword.compareTo(target) < 0)) {
//                continue;
//            }
//            if (isLegal(s, target)) {
//                lword = target;
//            }
//
//        }
//        return lword;


//        String res = "";
//        for (String str: d) {
//            int i = 0;
//            for (int j = 0;j<s.length();j++) {
//                char c = s.charAt(j);
//                if(i<str.length() && s.charAt(j) == c){
//                    i++;
//
//                }
//                if(i == str.length() && str.length() >= res.length()){
//                    if(str.length() > res.length() || (str.length() == res.length() && str < res)){
//                        res = str;
//                    }
//                }
//            }
//            return res;
//        }


    }
}
