package com.company.chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8899);
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        int readLength = bufferedReader.read();
        while (readLength != -1){
            System.out.println(bufferedReader.readLine());
        }

//        while (bufferedReader.readLine() != null){
//            System.out.println(bufferedReader.readLine());
//        }

//        int readLength = inputStream.read();
//        while (readLength != -1){
//            System.out.println(inputStream.read());
//        }


    }
}
