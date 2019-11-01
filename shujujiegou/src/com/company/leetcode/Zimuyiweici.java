package com.company.leetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Zimuyiweici {

    public boolean isAnagram(String s, String t) {
//        Set<String> set1 = new HashSet<>() ;
//        Set<String> set2 = new HashSet<>() ;

        if(s.length() != t.length()){
            return false;
        }
        Set<Character> set1 = new HashSet<>() ;
        Set<Character> set2 = new HashSet<>() ;

        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            set1.add(c);
        }

        for (int i = 0; i <t.length() ; i++) {
            char c = t.charAt(i);
            set2.add(c);
        }

        Iterator ite1 = set1.iterator();
        Iterator ite2 = set2.iterator();

        boolean isFullEqual = true;

        while (ite2.hasNext()){
            if(!set1.contains(ite2.next())){
                isFullEqual = false;
            }
        }
        return  isFullEqual;


    }
}
