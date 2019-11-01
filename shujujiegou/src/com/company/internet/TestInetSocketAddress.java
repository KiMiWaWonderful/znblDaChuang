package com.company.internet;

import java.net.InetSocketAddress;

//ip addr+port
public class TestInetSocketAddress {

    public static void main(String[] args) {

        InetSocketAddress isa = new InetSocketAddress("www.baidu.com",8888);

        System.out.println(isa);
        System.out.println(isa.getPort());
        System.out.println(isa.getAddress().getHostAddress());
        System.out.println(isa.getAddress().getHostName());


    }
}
