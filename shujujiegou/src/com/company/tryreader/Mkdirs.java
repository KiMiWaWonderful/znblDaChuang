package com.company.tryreader;
import java.io.File;
import java.io.IOException;

public class Mkdirs {

    public static void main(String[] args) throws IOException {
//        File file = new File("E:\\try\\try");
//        file.mkdirs();
       File file = new File("E:\\try\\try\\try.txt");
        file.createNewFile();//要有相应的目录才可以创建，做不到自行创建不存在的目录
    }
}
