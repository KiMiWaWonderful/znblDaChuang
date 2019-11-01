package com.company.tryreader;

import java.io.*;

public class Wwriter {

    public static void main(String[] args) {
        File file = new File("try.txt");
        try {
            PrintWriter printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(file)),true);
            String s = "Aeration";
            printWriter.println(s.getBytes());
            //printWriter.println(s);
            printWriter.append(s);
            printWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
