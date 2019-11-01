package com.company.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class AskClient {

    public static void main(String[] args) throws IOException {
        //创建一个DatagramSocket，用来发送或者接受数据
        //客户端接受数据的窗口，端口号可以省略，自动分配
        DatagramSocket socket = new DatagramSocket();
        Scanner scanner = new Scanner(System.in);

        while (true){
            //使用DatagramSocket发送一个DatagramPacket
            String info = scanner.nextLine();
            if("bye".equals(info)){
                break;
            }
            byte[] buf = info.getBytes();
            InetAddress address = InetAddress.getByName("192.168.2.1");
            int port = 8888;
            DatagramPacket datagramPacket = new DatagramPacket(buf,buf.length,address,port);
            socket.send(datagramPacket);

            //使用DatagramSocket接受一个DatagramPacket
            byte[] buf2 = new byte[1024];
            DatagramPacket datagramPacket2 = new DatagramPacket(buf2,buf2.length);
            socket.receive(datagramPacket2);
            System.out.println(new String(buf2,0,datagramPacket2.getLength()));


        }

        //关闭资源
        socket.close();




    }
}
