package com.company.lanqiao;

import java.io.*;
import java.net.URL;

public class FuZhiWangZhanNeiRong {
    public static void main(String[] args) throws Exception {

        URL url = new URL("https://www.163.com/");
        BufferedReader in = new BufferedReader(new InputStreamReader(
               url.openStream())); // 填空
        String inString;
        File outfile = new File("test.html");
        PrintWriter out = new PrintWriter(new FileWriter(outfile));
        while ((inString = in.readLine()) != null) {
            out.println(inString);
        }
        in.close();
        out.close();
    }


}
