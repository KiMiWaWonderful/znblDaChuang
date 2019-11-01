package com.company.login;

import java.io.*;
import java.net.Socket;

public class LoginThread extends Thread{

    private Socket socket = null;


    public LoginThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        ObjectInputStream ois = null;
        DataOutputStream dos = null;

       // InputStream is;
        try {
            //接受来自客户端的数据并输出
            ois  = new ObjectInputStream(socket.getInputStream());
            User user = null;
            try {
                user = (User) ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println(user);

            //发送反馈数据给客户端
             dos = new DataOutputStream(socket.getOutputStream());
            if(user != null &&"bjsxt" .equals(user.getUsername())){
                dos.writeUTF("你好，登录成功.");

            }else {
                dos.writeUTF("你好，登录失败.");
            }
        }catch (IOException e){

        }finally {
            //关闭网络资源
            try {
                if(dos != null){
                    dos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(ois != null){
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(socket != null){
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            //serverSocket.close();
        }




    }
}
