package com.company.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class AskServer {

    public static void main(String[] args) throws IOException {

        //创建一个DatagramSocket，用来发送或者接受数据
        DatagramSocket socket = new DatagramSocket(8888);
        Scanner scanner = new Scanner(System.in);

        //使用DatagramSocket接受一个DatagramPacket
        while (true){
            byte[] buf = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(buf,buf.length);
            socket.receive(datagramPacket);
            String str = new String(buf,0,datagramPacket.getLength());;
            if("bye".equals(str)){
                break;
            }
            System.out.println(str);

            //使用DatagramSocket发送一个DatagramPacket
            String info = scanner.nextLine();;
            byte[] buf2 = info.getBytes();
            InetAddress address = datagramPacket.getAddress();
            int port = datagramPacket.getPort();
            DatagramPacket datagramPacket2 = new DatagramPacket(buf2,buf2.length,address,port);
            socket.send(datagramPacket2);

        }

//


        //关闭资源
        socket.close();

    }
}
