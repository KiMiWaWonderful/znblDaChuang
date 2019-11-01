package com.company.login;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class LoginClient {

    public static void main(String[] args) throws IOException {
        //创建一个socket，指定服务器的ip和端口
        Socket socket = new Socket(InetAddress.getByName("192.168.2.1"),8888);

        //从键盘输入用户名和密码
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = scanner.next();
        System.out.println("请输入密码：");
        String password = scanner.next();
        User user = new User(username,password);

        //发送登录信息
        OutputStream os = socket.getOutputStream();
//        DataOutputStream dos = new DataOutputStream(os);
//        dos.writeUTF("username="+username+"&password="+password);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(user);

        //接受来自服务器的反馈信息并输出
        InputStream is = socket.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String result = dis.readUTF();
        System.out.println("这里是客户端，服务器的响应是："+result);

        //关闭网络资源
        dis.close();
        oos.close();
        is.close();
        os.close();
        socket.close();

    }
}
