package com.company.login;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class LoginServer {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //创建一个serverSocket,指定监听窗口
        ServerSocket serverSocket = new ServerSocket(8888);

        //使用ServerSocket监听用户的请求
        int i = 1;
        //如果没有用户的请求，就一直等待
        while (true){
            Socket socket = serverSocket.accept();

            //创建一个新的线程
            Thread thread = new LoginThread(socket);
            thread.start();

            //输出访问量、客户端IP地址
            InetAddress ia = socket.getInetAddress();
            System.out.println("你是访问服务器端的第"+(i++)+"个用户，你的ip地址是"+
            ia.getHostAddress());
        }
    }

}
