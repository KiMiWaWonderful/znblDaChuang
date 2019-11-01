package com.company.chapter4;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost",8899);

        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);

        while (true){
            printWriter.print("nihao");
        }

//        Scanner scanner = new Scanner(System.in);
//
//        while (scanner.next() != null){
//            printWriter.print(scanner.next());
//            printWriter.flush();
//        }

    }
}
