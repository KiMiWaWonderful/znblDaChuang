package com.company.server;

import java.net.InetAddress;
import java.net.Socket;

public class ClientTwo {

    public static void main(String[] args) throws Exception{
      // while (true){
           Socket socket1 = new Socket(InetAddress.getByName("192.168.199.151"),33333);
            Socket socket2 = new Socket(InetAddress.getByName("192.168.199.151"),33334);
       // }

    }

}
