package com.company.lanqiao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zhengzebiaodashi {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d+");
        System.out.println(pattern);

        Matcher matcher = pattern.matcher("1234");
        System.out.println(matcher);

        Matcher matcher1 = Pattern.compile("\\d+").matcher("2005");
        System.out.println(matcher1.group());


        System.out.println(Pattern.matches("\\d+","2222"));
    }
}
